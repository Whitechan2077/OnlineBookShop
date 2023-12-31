USE [master]
GO
/****** Object:  Database [BookStore]    Script Date: 14/10/2023 4:30:33 CH ******/
CREATE DATABASE [BookStore]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'BookStore', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\BookStore.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'BookStore_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\BookStore_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
Use [BookStore];
GO
ALTER DATABASE [BookStore] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [BookStore].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [BookStore] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [BookStore] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [BookStore] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [BookStore] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [BookStore] SET ARITHABORT OFF 
GO
ALTER DATABASE [BookStore] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [BookStore] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [BookStore] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [BookStore] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [BookStore] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [BookStore] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [BookStore] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [BookStore] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [BookStore] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [BookStore] SET  ENABLE_BROKER 
GO
ALTER DATABASE [BookStore] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [BookStore] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [BookStore] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [BookStore] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [BookStore] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [BookStore] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [BookStore] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [BookStore] SET RECOVERY FULL 
GO
ALTER DATABASE [BookStore] SET  MULTI_USER 
GO
ALTER DATABASE [BookStore] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [BookStore] SET DB_CHAINING OFF 
GO
ALTER DATABASE [BookStore] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [BookStore] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [BookStore] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'BookStore', N'ON'
GO
ALTER DATABASE [BookStore] SET QUERY_STORE = OFF
GO
USE [BookStore]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[UID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](20) NULL,
	[password] [nvarchar](20) NULL,
	[RoleID] [int] NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [Account_pk] PRIMARY KEY CLUSTERED 
(
	[UID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietTacGia]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietTacGia](
	[ID] [int] NOT NULL,
	[IdSach] [int] NULL,
	[IdTacGia] [int] NULL,
	[ThemBoi] [int] NULL,
	[CapNhatBoi] [int] NULL,
 CONSTRAINT [ChiTietTacGia_pk] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DiaChi]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DiaChi](
	[IdDiaChi] [int] IDENTITY(1,1) NOT NULL,
	[ThanhPho] [nvarchar](255) NULL,
	[QuanHuyen] [nvarchar](255) NULL,
	[XaPhuong] [nvarchar](255) NULL,
	[UID] [int] NULL,
	[ChiTietDiaChi] [varchar](255) NULL,
	[TrangThai] [int] NULL,
	[Ten] [nvarchar](100) NULL,
	[SDT] [nvarchar](10) NULL,
 CONSTRAINT [DiaChi_pk] PRIMARY KEY CLUSTERED 
(
	[IdDiaChi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioHang]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioHang](
	[IDGioHang] [int] IDENTITY(1,1) NOT NULL,
	[UID] [int] NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [GioHang_pk] PRIMARY KEY CLUSTERED 
(
	[IDGioHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioHangChiTiet]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioHangChiTiet](
	[ID] [int] NOT NULL,
	[IDGioHang] [int] NULL,
	[IDSach] [int] NULL,
	[SoLuong] [int] NULL,
	[NgayThem] [date] NULL,
 CONSTRAINT [GioHangChiTiet_pk] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[IdHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[NgayTao] [date] NULL,
	[TongTien] [float] NULL,
	[DiaChi] [int] NULL,
	[TrangThai] [int] NULL,
	[NhanVienQuanLy] [int] NULL,
	[IdAccount] [int] NULL,
 CONSTRAINT [HoaDon_pk] PRIMARY KEY CLUSTERED 
(
	[IdHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDHoaDon] [int] NULL,
	[IDSach] [int] NULL,
	[TrangThai] [int] NULL,
	[NgayThem] [int] NULL,
 CONSTRAINT [HoaDonChiTiet_pk] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[ID] [bigint] IDENTITY(1,1) NOT NULL,
	[TenKhachHang] [nvarchar](60) NULL,
	[SDT] [nvarchar](10) NULL,
	[Anh] [nvarchar](255) NULL,
	[UID] [int] NULL,
	[Email] [int] NULL,
	[NgayDangKi] [date] NULL,
 CONSTRAINT [KhachHang_pk] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhoSach]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhoSach](
	[IDKhoSach] [int] IDENTITY(1,1) NOT NULL,
	[KichThuoc] [varchar](50) NULL,
	[TaoBoi] [int] NULL,
	[CapNhatBoi] [int] NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [KhoSach_pk] PRIMARY KEY CLUSTERED 
(
	[IDKhoSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiBia]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiBia](
	[IdBiaSach] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NULL,
	[TaoBoi] [int] NULL,
	[CapNhatBoi] [int] NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [LoaiBia_pk] PRIMARY KEY CLUSTERED 
(
	[IdBiaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiSach]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSach](
	[IdLoai] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](60) NULL,
	[IdLoaiCha] [int] NULL,
	[TaoBoi] [int] NULL,
	[SuaBoi] [int] NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [LoaiSach_pk] PRIMARY KEY CLUSTERED 
(
	[IdLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NgonNgu]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NgonNgu](
	[IdNgonNgu] [int] IDENTITY(1,1) NOT NULL,
	[TenNgonNgu] [nvarchar](20) NULL,
	[TaoBoi] [int] NULL,
	[CapNhatBoi] [int] NULL,
 CONSTRAINT [NgonNgu_pk] PRIMARY KEY CLUSTERED 
(
	[IdNgonNgu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[IdNhaCungCap] [int] IDENTITY(1,1) NOT NULL,
	[TenNhaCungCap] [nvarchar](50) NULL,
	[NgayDangKi] [date] NULL,
	[TrangThai] [int] NULL,
	[ThemBoi] [int] NULL,
	[CapNhatBoi] [int] NULL,
 CONSTRAINT [NhaCungCap_pk] PRIMARY KEY CLUSTERED 
(
	[IdNhaCungCap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[ID] [bigint] IDENTITY(1,1) NOT NULL,
	[TenNhanVien] [nvarchar](60) NULL,
	[SDT] [nvarchar](10) NULL,
	[Anh] [nvarchar](255) NULL,
	[UID] [int] NULL,
	[NgayBatDauHopDong] [date] NULL,
	[NgayKetThucHopDong] [date] NULL,
	[GhiChu] [int] NULL,
	[NgaySinh] [date] NULL,
 CONSTRAINT [NhanVien_pk] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NXB]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NXB](
	[IdNXB] [int] IDENTITY(1,1) NOT NULL,
	[TenNXB] [nvarchar](100) NULL,
	[NgayDangKi] [date] NULL,
	[NguoiTao] [int] NULL,
	[CapNhatBoi] [int] NULL,
	[trangThai] [int] NULL,
 CONSTRAINT [NXB_pk] PRIMARY KEY CLUSTERED 
(
	[IdNXB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[RoleID] [int] IDENTITY(1,1) NOT NULL,
	[RoleName] [nvarchar](20) NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [Role_pk] PRIMARY KEY CLUSTERED 
(
	[RoleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[IdSach] [int] IDENTITY(1,1) NOT NULL,
	[TenSach] [nvarchar](255) NULL,
	[TaiBan] [int] NULL,
	[GiaTien] [float] NULL,
	[NgayXuatBan] [date] NULL,
	[NoiDung] [nvarchar](255) NULL,
	[NgayThem] [date] NULL,
	[NgonNgu] [int] NULL,
	[TrongLuong] [int] NULL,
	[IdLoaiBia] [int] NULL,
	[IdNhaCungCap] [int] NULL,
	[IdNhaXuatBan] [int] NULL,
	[ThemBoi] [int] NULL,
	[CapNhaBoi] [int] NULL,
	[Anh] [nvarchar](300) NULL,
	[IdKhoSach] [int] NULL,
	[IdTheLoai] [int] NULL,
 CONSTRAINT [Sach_pk] PRIMARY KEY CLUSTERED 
(
	[IdSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TacGia]    Script Date: 14/10/2023 4:30:33 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TacGia](
	[IdTacGia] [int] NOT NULL,
	[NgaySinh] [date] NULL,
	[Ten] [nvarchar](100) NULL,
	[TieuSu] [nvarchar](500) NULL,
	[ThemBoi] [int] NULL,
	[CapNhatBoi] [int] NULL,
 CONSTRAINT [TacGia_pk] PRIMARY KEY CLUSTERED 
(
	[IdTacGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([UID], [Username], [password], [RoleID], [TrangThai]) VALUES (1, N'white2077', N'06122004', 1, 1)
INSERT [dbo].[Account] ([UID], [Username], [password], [RoleID], [TrangThai]) VALUES (2, N'vuthuylinh', N'123', 3, 1)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[DiaChi] ON 

INSERT [dbo].[DiaChi] ([IdDiaChi], [ThanhPho], [QuanHuyen], [XaPhuong], [UID], [ChiTietDiaChi], [TrangThai], [Ten], [SDT]) VALUES (1, N'Phú Thọ', N'Hạ Hòa', N'Vĩnh Chân', 2, N'Khu10', NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[DiaChi] OFF
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([ID], [TenKhachHang], [SDT], [Anh], [UID], [Email], [NgayDangKi]) VALUES (2, N'Vũ Thùy Linh', N'1234566789', N'https://www.google.com.vn/url?sa=i&url=https%3A%2F%2Fgenshin-guide.com%2Fnhan-vat%2Fganyu&psig=AOvVaw0tmdZVqj2aScwHZd8FEx4i&ust=1697132728844000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCLiZtZrG7oEDFQAAAAAdAAAAABAE', 2, NULL, NULL)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
GO
SET IDENTITY_INSERT [dbo].[KhoSach] ON 

INSERT [dbo].[KhoSach] ([IDKhoSach], [KichThuoc], [TaoBoi], [CapNhatBoi], [TrangThai]) VALUES (1, N'4x3 CM', 1, NULL, 1)
SET IDENTITY_INSERT [dbo].[KhoSach] OFF
GO
SET IDENTITY_INSERT [dbo].[LoaiBia] ON 

INSERT [dbo].[LoaiBia] ([IdBiaSach], [TenLoai], [TaoBoi], [CapNhatBoi], [TrangThai]) VALUES (1, N'Bìa Cứng', 1, NULL, 1)
SET IDENTITY_INSERT [dbo].[LoaiBia] OFF
GO
SET IDENTITY_INSERT [dbo].[LoaiSach] ON 

INSERT [dbo].[LoaiSach] ([IdLoai], [TenLoai], [IdLoaiCha], [TaoBoi], [SuaBoi], [TrangThai]) VALUES (1, N'Văn Học', NULL, 1, NULL, 1)
INSERT [dbo].[LoaiSach] ([IdLoai], [TenLoai], [IdLoaiCha], [TaoBoi], [SuaBoi], [TrangThai]) VALUES (2, N'Văn học trong nước', 1, 1, NULL, 1)
INSERT [dbo].[LoaiSach] ([IdLoai], [TenLoai], [IdLoaiCha], [TaoBoi], [SuaBoi], [TrangThai]) VALUES (3, N'Văn Học Nước Ngoài', 1, 1, NULL, 1)
SET IDENTITY_INSERT [dbo].[LoaiSach] OFF
GO
SET IDENTITY_INSERT [dbo].[NgonNgu] ON 

INSERT [dbo].[NgonNgu] ([IdNgonNgu], [TenNgonNgu], [TaoBoi], [CapNhatBoi]) VALUES (1, N'Tiếng anh', 1, NULL)
INSERT [dbo].[NgonNgu] ([IdNgonNgu], [TenNgonNgu], [TaoBoi], [CapNhatBoi]) VALUES (2, N'Tiếng Việt', 1, NULL)
INSERT [dbo].[NgonNgu] ([IdNgonNgu], [TenNgonNgu], [TaoBoi], [CapNhatBoi]) VALUES (3, N'Tiếng Nhật', 1, NULL)
SET IDENTITY_INSERT [dbo].[NgonNgu] OFF
GO
SET IDENTITY_INSERT [dbo].[NhaCungCap] ON 

INSERT [dbo].[NhaCungCap] ([IdNhaCungCap], [TenNhaCungCap], [NgayDangKi], [TrangThai], [ThemBoi], [CapNhatBoi]) VALUES (1, N'Công Ty ABC', CAST(N'2023-10-06' AS Date), 1, NULL, NULL)
SET IDENTITY_INSERT [dbo].[NhaCungCap] OFF
GO
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([ID], [TenNhanVien], [SDT], [Anh], [UID], [NgayBatDauHopDong], [NgayKetThucHopDong], [GhiChu], [NgaySinh]) VALUES (1, N'Bùi Hoàng Dũng', N'0397767819', N'https://www.google.com.vn/url?sa=i&url=https%3A%2F%2Fgenshin-guide.com%2Fnhan-vat%2Fganyu&psig=AOvVaw0tmdZVqj2aScwHZd8FEx4i&ust=1697132728844000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCLiZtZrG7oEDFQAAAAAdAAAAABAE', 1, NULL, NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
GO
SET IDENTITY_INSERT [dbo].[NXB] ON 

INSERT [dbo].[NXB] ([IdNXB], [TenNXB], [NgayDangKi], [NguoiTao], [CapNhatBoi], [trangThai]) VALUES (1, N'Nhà Xuất Bản Kim Đồng', CAST(N'2023-10-20' AS Date), 1, NULL, NULL)
SET IDENTITY_INSERT [dbo].[NXB] OFF
GO
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([RoleID], [RoleName], [TrangThai]) VALUES (1, N'Admin', NULL)
INSERT [dbo].[Role] ([RoleID], [RoleName], [TrangThai]) VALUES (2, N'Nhân Viên', NULL)
INSERT [dbo].[Role] ([RoleID], [RoleName], [TrangThai]) VALUES (3, N'Khách', NULL)
SET IDENTITY_INSERT [dbo].[Role] OFF
GO
SET IDENTITY_INSERT [dbo].[Sach] ON 

INSERT [dbo].[Sach] ([IdSach], [TenSach], [TaiBan], [GiaTien], [NgayXuatBan], [NoiDung], [NgayThem], [NgonNgu], [TrongLuong], [IdLoaiBia], [IdNhaCungCap], [IdNhaXuatBan], [ThemBoi], [CapNhaBoi], [Anh], [IdKhoSach], [IdTheLoai]) VALUES (1, N'Con sói Cô đơn', 1, 100000000, CAST(N'2023-10-12' AS Date), NULL, CAST(N'2023-10-12' AS Date), 2, 150, 1, 1, 1, 1, NULL, NULL, 1, 2)
SET IDENTITY_INSERT [dbo].[Sach] OFF
GO
/****** Object:  Index [KhachHang_pk2]    Script Date: 14/10/2023 4:30:33 CH ******/
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [KhachHang_pk2] UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [NhanVien_pk2]    Script Date: 14/10/2023 4:30:33 CH ******/
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [NhanVien_pk2] UNIQUE NONCLUSTERED 
(
	[SDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [Account_Role_RoleID_fk] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Role] ([RoleID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [Account_Role_RoleID_fk]
GO
ALTER TABLE [dbo].[ChiTietTacGia]  WITH CHECK ADD  CONSTRAINT [ChiTietTacGia_Account_UID_fk] FOREIGN KEY([ThemBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[ChiTietTacGia] CHECK CONSTRAINT [ChiTietTacGia_Account_UID_fk]
GO
ALTER TABLE [dbo].[ChiTietTacGia]  WITH CHECK ADD  CONSTRAINT [ChiTietTacGia_Account_UID_fk2] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[ChiTietTacGia] CHECK CONSTRAINT [ChiTietTacGia_Account_UID_fk2]
GO
ALTER TABLE [dbo].[ChiTietTacGia]  WITH CHECK ADD  CONSTRAINT [ChiTietTacGia_Sach_IdSach_fk] FOREIGN KEY([IdSach])
REFERENCES [dbo].[Sach] ([IdSach])
GO
ALTER TABLE [dbo].[ChiTietTacGia] CHECK CONSTRAINT [ChiTietTacGia_Sach_IdSach_fk]
GO
ALTER TABLE [dbo].[ChiTietTacGia]  WITH CHECK ADD  CONSTRAINT [ChiTietTacGia_TacGia_IdTacGia_fk] FOREIGN KEY([IdTacGia])
REFERENCES [dbo].[TacGia] ([IdTacGia])
GO
ALTER TABLE [dbo].[ChiTietTacGia] CHECK CONSTRAINT [ChiTietTacGia_TacGia_IdTacGia_fk]
GO
ALTER TABLE [dbo].[DiaChi]  WITH CHECK ADD  CONSTRAINT [DiaChi_Account_UID_fk] FOREIGN KEY([UID])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[DiaChi] CHECK CONSTRAINT [DiaChi_Account_UID_fk]
GO
ALTER TABLE [dbo].[GioHang]  WITH CHECK ADD  CONSTRAINT [GioHang_Account_UID_fk] FOREIGN KEY([UID])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[GioHang] CHECK CONSTRAINT [GioHang_Account_UID_fk]
GO
ALTER TABLE [dbo].[GioHangChiTiet]  WITH CHECK ADD  CONSTRAINT [GioHangChiTiet_GioHang_IDGioHang_fk] FOREIGN KEY([IDGioHang])
REFERENCES [dbo].[GioHang] ([IDGioHang])
GO
ALTER TABLE [dbo].[GioHangChiTiet] CHECK CONSTRAINT [GioHangChiTiet_GioHang_IDGioHang_fk]
GO
ALTER TABLE [dbo].[GioHangChiTiet]  WITH CHECK ADD  CONSTRAINT [GioHangChiTiet_Sach_IdSach_fk] FOREIGN KEY([IDSach])
REFERENCES [dbo].[Sach] ([IdSach])
GO
ALTER TABLE [dbo].[GioHangChiTiet] CHECK CONSTRAINT [GioHangChiTiet_Sach_IdSach_fk]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [HoaDon_Account_UID_fk] FOREIGN KEY([NhanVienQuanLy])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [HoaDon_Account_UID_fk]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [HoaDon_Account_UID_fk2] FOREIGN KEY([IdAccount])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [HoaDon_Account_UID_fk2]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [HoaDonChiTiet_HoaDon_IdHoaDon_fk] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[HoaDon] ([IdHoaDon])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [HoaDonChiTiet_HoaDon_IdHoaDon_fk]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [HoaDonChiTiet_Sach_IdSach_fk] FOREIGN KEY([IDSach])
REFERENCES [dbo].[Sach] ([IdSach])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [HoaDonChiTiet_Sach_IdSach_fk]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [KhachHang_Account_UID_fk] FOREIGN KEY([UID])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [KhachHang_Account_UID_fk]
GO
ALTER TABLE [dbo].[KhoSach]  WITH CHECK ADD  CONSTRAINT [KhoSach_Account_UID_fk] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[KhoSach] CHECK CONSTRAINT [KhoSach_Account_UID_fk]
GO
ALTER TABLE [dbo].[KhoSach]  WITH CHECK ADD  CONSTRAINT [KhoSach_Account_UID_UID_fk] FOREIGN KEY([TaoBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[KhoSach] CHECK CONSTRAINT [KhoSach_Account_UID_UID_fk]
GO
ALTER TABLE [dbo].[LoaiBia]  WITH CHECK ADD  CONSTRAINT [LoaiBia_Account_UID_fk] FOREIGN KEY([TaoBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[LoaiBia] CHECK CONSTRAINT [LoaiBia_Account_UID_fk]
GO
ALTER TABLE [dbo].[LoaiBia]  WITH CHECK ADD  CONSTRAINT [LoaiBia_Account_UID_fk2] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[LoaiBia] CHECK CONSTRAINT [LoaiBia_Account_UID_fk2]
GO
ALTER TABLE [dbo].[LoaiSach]  WITH CHECK ADD  CONSTRAINT [LoaiSach_Account_UID_fk] FOREIGN KEY([TaoBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[LoaiSach] CHECK CONSTRAINT [LoaiSach_Account_UID_fk]
GO
ALTER TABLE [dbo].[LoaiSach]  WITH CHECK ADD  CONSTRAINT [LoaiSach_Account_UID_fk2] FOREIGN KEY([SuaBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[LoaiSach] CHECK CONSTRAINT [LoaiSach_Account_UID_fk2]
GO
ALTER TABLE [dbo].[LoaiSach]  WITH CHECK ADD  CONSTRAINT [LoaiSach_LoaiSach_IdLoai_fk] FOREIGN KEY([IdLoaiCha])
REFERENCES [dbo].[LoaiSach] ([IdLoai])
GO
ALTER TABLE [dbo].[LoaiSach] CHECK CONSTRAINT [LoaiSach_LoaiSach_IdLoai_fk]
GO
ALTER TABLE [dbo].[NgonNgu]  WITH CHECK ADD  CONSTRAINT [NgonNgu_Account_UID_fk] FOREIGN KEY([TaoBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NgonNgu] CHECK CONSTRAINT [NgonNgu_Account_UID_fk]
GO
ALTER TABLE [dbo].[NgonNgu]  WITH CHECK ADD  CONSTRAINT [NgonNgu_Account_UID_fk2] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NgonNgu] CHECK CONSTRAINT [NgonNgu_Account_UID_fk2]
GO
ALTER TABLE [dbo].[NhaCungCap]  WITH CHECK ADD  CONSTRAINT [NhaCungCap_Account_UID_fk] FOREIGN KEY([ThemBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NhaCungCap] CHECK CONSTRAINT [NhaCungCap_Account_UID_fk]
GO
ALTER TABLE [dbo].[NhaCungCap]  WITH CHECK ADD  CONSTRAINT [NhaCungCap_Account_UID_fk2] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NhaCungCap] CHECK CONSTRAINT [NhaCungCap_Account_UID_fk2]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [NhanVien_Account_UID_fk] FOREIGN KEY([UID])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [NhanVien_Account_UID_fk]
GO
ALTER TABLE [dbo].[NXB]  WITH CHECK ADD  CONSTRAINT [NXB_Account_UID_fk] FOREIGN KEY([NguoiTao])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NXB] CHECK CONSTRAINT [NXB_Account_UID_fk]
GO
ALTER TABLE [dbo].[NXB]  WITH CHECK ADD  CONSTRAINT [NXB_Account_UID_fk2] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[NXB] CHECK CONSTRAINT [NXB_Account_UID_fk2]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_Account_UID_fk] FOREIGN KEY([ThemBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_Account_UID_fk]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_Account_UID_fk2] FOREIGN KEY([CapNhaBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_Account_UID_fk2]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_KhoSach_IDKhoSach_fk] FOREIGN KEY([IdKhoSach])
REFERENCES [dbo].[KhoSach] ([IDKhoSach])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_KhoSach_IDKhoSach_fk]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_LoaiBia_IdBiaSach_fk] FOREIGN KEY([IdLoaiBia])
REFERENCES [dbo].[LoaiBia] ([IdBiaSach])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_LoaiBia_IdBiaSach_fk]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_LoaiSach_IdLoai_fk] FOREIGN KEY([IdTheLoai])
REFERENCES [dbo].[LoaiSach] ([IdLoai])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_LoaiSach_IdLoai_fk]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_NgonNgu_IdNgonNgu_fk] FOREIGN KEY([NgonNgu])
REFERENCES [dbo].[NgonNgu] ([IdNgonNgu])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_NgonNgu_IdNgonNgu_fk]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_NhaCungCap_IdNhaCungCap_fk] FOREIGN KEY([IdNhaCungCap])
REFERENCES [dbo].[NhaCungCap] ([IdNhaCungCap])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_NhaCungCap_IdNhaCungCap_fk]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [Sach_NXB_IdNXB_fk] FOREIGN KEY([IdNhaXuatBan])
REFERENCES [dbo].[NXB] ([IdNXB])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [Sach_NXB_IdNXB_fk]
GO
ALTER TABLE [dbo].[TacGia]  WITH CHECK ADD  CONSTRAINT [TacGia_Account_UID_fk] FOREIGN KEY([ThemBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[TacGia] CHECK CONSTRAINT [TacGia_Account_UID_fk]
GO
ALTER TABLE [dbo].[TacGia]  WITH CHECK ADD  CONSTRAINT [TacGia_Account_UID_fk2] FOREIGN KEY([CapNhatBoi])
REFERENCES [dbo].[Account] ([UID])
GO
ALTER TABLE [dbo].[TacGia] CHECK CONSTRAINT [TacGia_Account_UID_fk2]
GO
USE [master]
GO
ALTER DATABASE [BookStore] SET  READ_WRITE 
GO
