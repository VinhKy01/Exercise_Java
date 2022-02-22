CREATE DATABASE DTB_DOAN_JAVA_TEST
go

use DTB_DOAN_JAVA_TEST
go

--TAIKHOAN
--NHANVIEN
--TIVI
--HANGTIVI
--DONHANG
--TTDONHANG
--KHACHHANG


------------------------------------BẢNG NHÂN VIÊN---------------------------------------------
CREATE TABLE NHANVIEN
(
	msnv nvarchar(100) primary key,
	hoten nvarchar(100) not null,
	gioitinh nvarchar(10) not null check (gioitinh = N'Nam' or gioitinh = N'Nữ') default N'Nam',
	diachi nvarchar(100) not null,
	namsinh date not null,
	sdt nvarchar(10) not null,
	luongcoban int not null default 0,
	hesoluong float not null default 0
)
GO

------------------------------------BẢNG TÀI KHOẢNG---------------------------------------------
CREATE TABLE TAIKHOAN
(
	username nvarchar(100) primary key,
	password  nvarchar(100) not null,
	loaitk int default 0, -- 0 nha vien || 1 quan ly || -1
	masonv nvarchar(100) not null

	FOREIGN KEY (masonv) REFERENCES dbo.NHANVIEN(msnv)
)
GO

------------------------------------BẢNG HÃNG TIVI---------------------------------------------
CREATE TABLE HANGTIVI
(
	mshang int identity primary key,
	tenhang nvarchar(100) not null
)
GO





------------------------------------BẢNG TIVI---------------------------------------------
CREATE TABLE TIVI
(
	mstivi  nvarchar(100) primary key,
	tentivi nvarchar(100) not null,
	mshang int not null,
	kichthuoc int not null,
	gia int not null,
	baohanh int not null,
	tinhtrang nvarchar(10) not null check(tinhtrang = N'Mới' OR tinhtrang = N'Cũ') default N'Mới',
	soluong int not null

	FOREIGN KEY (mshang) REFERENCES dbo.HANGTIVI(mshang)
)
GO


------------------------------------BẢNG KHÁCH HÀNG---------------------------------------------
CREATE TABLE KHACHHANG
(
	mskh nvarchar(20) primary key,
	tenkh nvarchar(100) not null,
	gioitinh nvarchar(10) not null check (gioitinh = N'Nam' or gioitinh = N'Nữ'),
	namsinh date not null,
	diachi nvarchar(100) not null,
	sdt nvarchar(100) not null,
)
GO


------------------------------------BẢNG HÓA ĐƠN---------------------------------------------
CREATE TABLE DONHANG
(
	madonhang nvarchar(20) primary key,
	ngayban date not null,
	makh nvarchar(20) not null, 
	khuyenmai int not null default 0,
	tongtien int not null default 0,
	manv nvarchar(100) not null,

	FOREIGN KEY (makh) REFERENCES dbo.KHACHHANG(mskh),
	FOREIGN KEY (manv) REFERENCES dbo.NHANVIEN(msnv),
)
GO

------------------------------------BẢNG THÔNG TIN HÓA ĐƠN---------------------------------------------
Create table TTDONHANG
(
	id int identity primary key,
	masp nvarchar(100) not null,
	iddonhang nvarchar(20) not null,
	soluong int not null,
	

	FOREIGN KEY (masp) REFERENCES dbo.tivi(mstivi),
	FOREIGN KEY (iddonhang) REFERENCES dbo.DONHANG(madonhang)
)
go


------------------------------------------------------------------CÁC STORE PROCERDUCE--------------------------------------------------------------

---------------------------------------------------------------------------------------------------------proc login

CREATE PROC USP_LOGIN
@user nvarchar(100), @pass nvarchar(100)
AS
BEGIN
	SELECT loaitk FROM TAIKHOAN WHERE username = @user and password = @pass
END
GO

-----------------------------------------------------------------------------------------------------load danhs ach tivi bang ten hang va kich thuong
create PROC USP_LISTTVBYHANG1
@hang nvarchar(100), @inch float
AS
BEGIN
	SELECT T.mstivi, H.tenhang, T.kichthuoc, T.gia,T.tinhtrang, T.baohanh FROM TIVI AS T, HANGTIVI AS H WHERE T.mshang = H.mshang AND  tenhang = @hang AND kichthuoc = @inch
END
GO

-----------------------------------------------------------------------------------------------------load tivi by model
create PROC USP_LISTTVBYMODEL
@model nvarchar(100)
AS
BEGIN
	SELECT T.mstivi, H.tenhang, T.kichthuoc, T.gia, T.tinhtrang, T.baohanh FROM TIVI AS T, HANGTIVI AS H WHERE T.mshang = H.mshang AND  mstivi = @model
END
GO


--------------------------------------------------------------------------------------------------- them khach hang
create proc USP_THEMKHACHHANG
@makh nvarchar(20) , @tenkh nvarchar(100), @gioitinh nvarchar(10),@namsinh date, @diachi nvarchar(100), @sdt nvarchar(100)
AS
BEGIN
	insert into KHACHHANG
	values
	(
		@makh , @tenkh, @gioitinh, @namsinh, @diachi, @sdt
	)
END
GO

------------------------------------------------------------------------------------------------------- xuat ds hoa don
create proc USP_DSHOADON
@date1 date, @date2 date
AS
BEGIN
	SELECT madonhang, tenkh, ngayban, khuyenmai, tongtien FROM DONHANG, KHACHHANG WHERE makh = mskh AND ngayban >= @date1 AND ngayban <= @date2
END
GO

--------------------------------------------------------------------------------KHO
create proc USP_KHO
AS 
BEGIN 
	select mstivi, tentivi, tenhang, kichthuoc, gia, tinhtrang, baohanh, soluong from TIVI AS T, HANGTIVI AS H where T.mshang = H.mshang AND T.mshang != 1
END 
GO

-------------------------------------------------------------------------------- xuat ds nhan vien
create proc USP_DSNV
AS
BEGIN
	select *, luong = luongcoban*hesoluong from NHANVIEN , TAIKHOAN where msnv = masonv and loaitk = 0
END
GO

-------------------------------------------------------------------------------- them tivi
create PROC USP_INSERTTIVI
@mstivi nvarchar(100), @tentivi nvarchar(100), @hangsx int, @kichthuoc int, @gia int, @baohanh int, @tinhtrang nvarchar(100), @soluong int
as
begin
	INSERT INTO TIVI
	VALUES
	(
		@mstivi , @tentivi , @hangsx  ,  @kichthuoc ,@gia , @baohanh , @tinhtrang , @soluong
	)
end
go
-------------------------------------------------------------------------------- update thong tin tivi
create PROC USP_UPDATETIVI
@mstivi nvarchar(100), @tentivi nvarchar(50), @hangsx int, @kichthuoc int, @gia int, @baohanh int, @tinhtrang nvarchar(100), @soluong int
AS 
BEGIN
	UPDATE TIVI
	SET   mshang = @hangsx, tentivi = @tentivi , kichthuoc = @kichthuoc, gia = @gia, baohanh = @baohanh, tinhtrang = @tinhtrang , soluong = @soluong
	WHERE mstivi = @mstivi;
END
GO

-------------------------------------------------------------------------------- delete thong tin tivi
CREATE PROC USP_DELETETIVI
@mstivi nvarchar(100)
AS 
BEGIN
	DELETE TIVI WHERE mstivi = @mstivi;
END
GO

-------------------------------------------------------------------------------- select id by name HANGTV
create PROC USP_SELECTID
@name nvarchar(100)
AS 
BEGIN	
	select * from HANGTIVI where tenhang = @name
END
GO

-------------------------------------------------------------------------------- them nhan vien
create proc USP_THEMNV
@msnv nvarchar(100), @hoten nvarchar(100), @gioitinh nvarchar(10), @diachi nvarchar(100), @namsinh date, @sdt nvarchar(10), @luongcoban int, @hsl float
AS
BEGIN
	insert into NHANVIEN
	values
	(
		@msnv , @hoten , @gioitinh , @diachi , @namsinh , @sdt , @luongcoban , @hsl
	)
END
GO

-------------------------------------------------------------------------------- xoa nhan vien
create proc USP_XOANV
@msnv nvarchar(100)
AS
BEGIN
	DELETE NHANVIEN WHERE msnv = @msnv;
END
GO

-------------------------------------------------------------------------------- sua nhan vien
CREATE proc USP_SUANV
@msnv nvarchar(100), @hoten nvarchar(100), @gioitinh nvarchar(10), @diachi nvarchar(100), @namsinh date, @sdt nvarchar(10), @luongcoban int, @hsl float
AS
BEGIN
		UPDATE NHANVIEN
		SET hoten = @hoten, gioitinh = @gioitinh, diachi = @diachi, namsinh= @namsinh, sdt = @sdt, luongcoban = @luongcoban, hesoluong = @hsl
		where msnv = @msnv
		
END
GO

-------------------------------------------------------------------------------- them tai khoan
create proc USP_THEMTK
@username nvarchar(100), @password nvarchar(100), @msnv nvarchar(100)
AS
BEGIN
	insert into TAIKHOAN
	values
	(
		@username, @password, 0, @msnv
	)
END
GO
-------------------------------------------------------------------------------- them tai khoan admin
create proc USP_THEMTKADMIN
@username nvarchar(100), @password nvarchar(100), @msnv nvarchar(100)
AS
BEGIN
	insert into TAIKHOAN
	values
	(
		@username, @password, 1, @msnv
	)
END
GO



-------------------------------------------------------------------------------- show tt don hang
create proc USP_TTDONHANG
@iddonhang int
as
begin
	select masp,gia, count(masp) as soluong, gia*count(masp) as thanhtien 
	from TTDONHANG, TIVI , DONHANG 
	where masp = mstivi and madonhang = @iddonhang and iddonhang = @iddonhang group by masp, gia
end
go

--------------------------------------------------------------------------------------------------- them hoa don hang



--------------------------------------------------------------------------------------------------- get hd by id
create proc USP_GETHDBYID
@id INT
AS
BEGIN 
	SELECT madonhang, tenkh, ngayban, khuyenmai, tongtien FROM DONHANG, KHACHHANG WHERE makh = mskh AND madonhang = @id
END
GO

-----------------------------------------------------------------------------------------------------get bill infor by id
create proc USP_GETBILLINFOR
@id int
AS 
BEGIN
	select masp,gia, count(masp) as soluong, gia*count(masp) as thanhtien from TTDONHANG, TIVI , DONHANG where masp = mstivi and madonhang = iddonhang and iddonhang = @id group by masp, gia
END
GO
--cap nhat tt don hang co ten tivi thanh eror(deleted)

create proc USP_UPDATETIVIEROR
@masp nvarchar(100)
AS 
BEGIN
	UPDATE TTDONHANG
	SET masp = 'EROR (DELETED)' 
	WHERE masp  = @masp
END 
GO

--update khach hang
create proc SuaKH
@mskh nvarchar(30), @ten nvarchar(50), @gioitinh nvarchar(10), @namsinh date, @diachi nvarchar(50), @sdt nvarchar(10)
as
begin
	update KHACHHANG set mskh = @mskh, tenkh = @ten, gioitinh = @gioitinh, namsinh = @namsinh, diachi = @diachi, sdt = @sdt
	where mskh = @mskh
end
go


INSERT INTO HANGTIVI VALUES('UNDETECTED')
insert into TIVI values('EROR (DELETED)','Tivi deleted', 1, 1, 1, 1, N'Mới', 1)

insert into KHACHHANG values ('deleted', 'deleted', 'Nam', getdate(), 'deleted', 'deleted')


--inser master account
insert into nhanvien values('master', '', 'Nam', '','20211116','',0,0)
insert into TAIKHOAN values('Username', 'Password', 1, 'master')

insert into nhanvien values('deleted', 'deleted', 'Nam', '','20211116','',0,0)
insert into TAIKHOAN values('deleted', 'deleted', 1, 'deleted')


