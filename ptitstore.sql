-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th11 29, 2024 lúc 06:54 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ptitstore`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `id` int(11) NOT NULL,
  `time` varchar(100) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `bill`
--

INSERT INTO `bill` (`id`, `time`, `date`, `total`) VALUES
(15, '12:28', '2024-11-29', 149000),
(16, '12:28', '2024-11-29', 149000),
(17, '12:28', '2024-11-29', 149000),
(18, '12:28', '2024-11-29', 149000),
(19, '12:30', '2024-11-29', 105000),
(20, '12:30', '2024-11-29', 105000),
(21, '12:30', '2024-11-29', 105000),
(22, '23:48', '2024-11-29', 110000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Food'),
(2, 'Drink');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `detailsbill`
--

CREATE TABLE `detailsbill` (
  `id` int(11) NOT NULL,
  `product` int(11) NOT NULL,
  `bill` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `detailsbill`
--

INSERT INTO `detailsbill` (`id`, `product`, `bill`, `quantity`, `price`) VALUES
(6, 9, 5, 1, 10000),
(7, 10, 5, 1, 20000),
(8, 11, 6, 1, 15000),
(9, 10, 6, 1, 20000),
(10, 16, 7, 1, 69000),
(11, 1, 8, 2, 40000),
(12, 10, 8, 1, 20000),
(13, 1, 9, 1, 20000),
(14, 2, 9, 1, 20000),
(15, 6, 9, 1, 10000),
(16, 16, 9, 1, 69000),
(17, 1, 10, 2, 40000),
(18, 2, 10, 1, 20000),
(19, 16, 10, 1, 69000),
(20, 8, 10, 1, 20000),
(21, 1, 11, 2, 40000),
(22, 2, 11, 1, 20000),
(23, 16, 11, 1, 69000),
(24, 8, 11, 1, 20000),
(25, 1, 12, 2, 40000),
(26, 2, 12, 1, 20000),
(27, 16, 12, 1, 69000),
(28, 8, 12, 1, 20000),
(29, 1, 13, 2, 40000),
(30, 2, 13, 1, 20000),
(31, 16, 13, 1, 69000),
(32, 8, 13, 1, 20000),
(33, 1, 14, 2, 40000),
(34, 2, 14, 1, 20000),
(35, 16, 14, 1, 69000),
(36, 8, 14, 1, 20000),
(37, 1, 15, 2, 40000),
(38, 2, 15, 1, 20000),
(39, 16, 15, 1, 69000),
(40, 8, 15, 1, 20000),
(41, 1, 16, 2, 40000),
(42, 2, 16, 1, 20000),
(43, 16, 16, 1, 69000),
(44, 8, 16, 1, 20000),
(45, 1, 17, 2, 40000),
(46, 2, 17, 1, 20000),
(47, 16, 17, 1, 69000),
(48, 8, 17, 1, 20000),
(49, 1, 18, 2, 40000),
(50, 2, 18, 1, 20000),
(51, 16, 18, 1, 69000),
(52, 8, 18, 1, 20000),
(53, 8, 19, 1, 20000),
(54, 3, 19, 1, 15000),
(55, 4, 19, 1, 25000),
(56, 10, 19, 1, 20000),
(57, 9, 19, 1, 10000),
(58, 11, 19, 1, 15000),
(59, 8, 20, 1, 20000),
(60, 3, 20, 1, 15000),
(61, 4, 20, 1, 25000),
(62, 10, 20, 1, 20000),
(63, 9, 20, 1, 10000),
(64, 11, 20, 1, 15000),
(65, 8, 21, 1, 20000),
(66, 3, 21, 1, 15000),
(67, 4, 21, 1, 25000),
(68, 10, 21, 1, 20000),
(69, 9, 21, 1, 10000),
(70, 11, 21, 1, 15000),
(71, 9, 22, 1, 10000),
(72, 10, 22, 1, 20000),
(73, 4, 22, 1, 25000),
(74, 5, 22, 1, 30000),
(75, 8, 22, 1, 20000),
(76, 7, 22, 1, 5000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `CategoryID` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`id`, `name`, `CategoryID`, `quantity`, `price`) VALUES
(1, 'Bánh Cookies Socola', 1, 20, '20000'),
(2, 'Bánh Phô Mai', 1, 20, '20000'),
(3, 'Bánh Sừng Bò', 1, 20, '15000'),
(4, 'Bánh Hamburger Gà', 1, 100, '25000'),
(5, 'Bánh Donut', 1, 50, '30000'),
(6, 'Bánh Tiramisu', 1, 200, '10000'),
(7, 'Bánh Mochi', 1, 500, '5000'),
(8, 'Bánh Mỳ Nem Khoai', 1, 20, '20000'),
(9, 'Trà Chanh', 2, 200, '10000'),
(10, 'Trà Đào', 2, 50, '20000'),
(11, 'Milo Đá Dầm', 2, 40, '15000'),
(12, 'Trà sữa', 2, 50, '69000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `name`, `username`, `password`, `sex`, `role`) VALUES
(3, 'Lê Quang Thanh', 'admin', 'c4ca4238a0b923820dcc509a6f75849b', 'Nam', 2),
(21, 'Trần Quang Nam', 'employee', 'c4ca4238a0b923820dcc509a6f75849b', 'Nam', 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `detailsbill`
--
ALTER TABLE `detailsbill`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bill` (`bill`);

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cat` (`CategoryID`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bill`
--
ALTER TABLE `bill`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `detailsbill`
--
ALTER TABLE `detailsbill`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- AUTO_INCREMENT cho bảng `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `fk_cat` FOREIGN KEY (`CategoryID`) REFERENCES `category` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
