-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 07, 2020 lúc 08:58 AM
-- Phiên bản máy phục vụ: 10.4.8-MariaDB
-- Phiên bản PHP: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `book_store`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listsanpham`
--

CREATE TABLE `listsanpham` (
  `ID` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `TenSP` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GiaSP` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `HinhAnh` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MoTa` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `idproducts` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listsanpham`
--

INSERT INTO `listsanpham` (`ID`, `status`, `TenSP`, `GiaSP`, `HinhAnh`, `MoTa`, `idproducts`) VALUES
(1, 1, 'Tấm cám', '40000', 'tam-cam.u547.d20170120.t100949.386890.jpg', 'Dựa theo chương trình kể chuyện của học sinh tiểu học, các câu chuyện được tóm lược lại, hình ảnh minh họa sinh động. Nội dung sách hướng các em tới những điều hay lẽ phải, giáo dục các em những đức tính cần thiết để trở thành người công dân tốt.', 1),
(2, 1, 'Thạch sanh', '30000', 'sanh-2-1580912075-64-width400height200-1580978864-876-width640height480.jpg', 'Ngày xưa, có một chàng tiều phu nghèo mồ côi cha mẹ tên là Thạch Sanh. Chàng sống trong túp lều tranh dưới gốc đa. Thạch Sanh rất chăm chỉ làm việc và có sức khỏe hơn người.\r\n\r\nMột hôm có một người bán rượu tên là Lý Thông ghé vào gốc đa nghỉ chân. Thấy Thạch Sanh khỏe mạnh, thật thà, Lý Thông bèn lân la kết nghĩa anh em và đưa Thạch Sanh về nhà mình ở.', 1),
(3, 1, 'Thạch sùng', '12000', NULL, 'Ko', 1),
(4, 1, 'Sọ dừa', '14000', 'unnamed.jpg', 'Sọ Dừa là một trong những câu truyện dân gian đặc sắc trong kho tàng truyện cổ tích văn học Việt Nam. Là một trong những truyện có nhiều giá trị và nhiều nét độc đáo đáng chú ý. Mang đậm chất truyện cổ tích, khắc họa hình ảnh, tính cách nhân vật nhẹ nhàng sâu sắc, những lời răn dạy nhẹ nhàng thấm đượm vào tâm hồn trẻ thơ.', 1),
(5, 1, 'ăn khế trả vàng', '18000', 'AKTV1.jpg', 'Ăn một quả, trả cục vàng\r\n\r\nMay túi ba gang, mang đi mà đựng!”\r\n\r\nNgười em thật thà làm theo lời con chim lạ đến ăn quả trên cây khế nhà mình. Thế là vợ chồng người em trở nên giàu có. Người anh tham lam, cũng muốn được chim đưa đi lấy vàng nên đổi cả gia tài để lấy cây khế của em. Các em thử đoán xem, liệu anh ta có được như ý?', 1),
(6, 1, 'Giết Con Chim Nhại', '56000', '71ddae5c7ce50ab004c810849637576c.jpg', 'Nào, hãy mở cuốn sách này ra. Bạn phải làm quen ngay với bố Atticus của hai anh em - Jem và Scout, ông bố luật sư có một cách riêng, để những đứa trẻ của mình cứng cáp và vững vàng hơn khi đón nhận những bức xúc không sao hiểu nổi trong cuộc sống. Bạn sẽ nhớ rất lâu người đàn ông thích trốn trong nhà Boo Radley, kẻ bị đám đông coi là lập dị đã chọn một cách rất riêng để gửi những món quà nhỏ cho Jem và Scout, và khi chúng lâm nguy, đã đột nhiên xuất hiện để che chở. Và tất nhiên, bạn không thể bỏ qua anh chàng Tom Robinson, kẻ bị kết án tử hình ', 6),
(7, 1, 'Ông Trăm Tuổi Trèo Qua Cửa Sổ Và Biến Mất', '350000', 'sach-ong-tram-tuoi-treo-qua-cua-so-va-bien-mat.jpg', 'hông ai sinh ra là sẽ được sống trong mộng ước của mình, và chính cụ Allan cũng như thế. Chắc hẳn ai cũng từng nghĩ cuộc đời của mình trôi qua trông thật vô vị nhỉ? Nhưng Allan thì không như thế. Cả cuộc đời của cụ như dòng điện tâm đồ có đi lên mà cũng chẳng thể quên nổi những nốt ngã đau điếng đấy. Quyển sách mở đầu trong cái cảnh chán ngắt của nhà già (cái cách mà cụ gọi viện dưỡng lão mà cụ không ưa tí nào), nhưng cái cách cụ đối mặt thì không chán tí nào, cụ tinh quái và thích làm thì sẽ không ngại ngần vì bất kì lý do nào. Và dần dần cuộc đời đầy màu sắc của cụ sẽ mở ra. Đọc sách đi để thấy mình thật nhỏ bé..', 6),
(8, 1, '5 Centimet Trên Giây', '120000', '5cm.gif', 'Bằng giọng văn tinh tế, truyền cảm, 5 centimet trên giây mang đến những khắc họa mới về tâm hồn và khả năng tồn tại của cảm xúc, bắt đầu từ tình yêu trong sáng, ngọt ngào của một cô bé và cậu bé. Ba giai đoạn, ba mảnh ghép, ba ngôi kể chuyện khác nhau nhưng đều xoay quanh nhân vật nam chính, người luôn bị ám ảnh bởi kí ức và những điều đã qua…', 6),
(9, 1, 'Khế Ước Xã Hội', '88000', 'news_258rousseau.jpg', 'Khế Ước Xã Hội là một trong những tác phẩm quan trọng nhất trong thời kỳ Khai sáng, mở đường cho Cách mạng Pháp và Tuyên ngôn Nhân quyền Pháp năm 1789.\r\nKhế ước Xã hội gồm bốn quyển, mỗi quyển từ mười tới mười lăm chương. Trong lời mở đầu Rousseau viết: “Với bản chất con người như ta biết, và với tính chất có thể xảy ra của luật pháp, tôi muốn tìm xem trong trật tự của một xã hội dân sự có thể có một luật lệ cai trị nào chắc chắn và hợp tình hợp lý...”\r\n\r\nTrong cuộc hành trình này, Rousseau cũng như các nhà tư tưởng trước ông như Thomas Hobbes và John Locke đều bắt đầu từ nguyên thủy, nhận diện con người trong trạng thái thiên nhiên của nó. Mở đầu chương thứ nhất Rousseau viết: “Con người sinh ra được tự do, nhưng ở đâu họ cũng bị xiềng xích.” Đối với Rousseau, tự do là điều kiện thiết yếu để con người là một con người. Trong trạng thái thiên nhiên mỗi con người là chủ của chính mình, nhưng từng cá nhân một không thể chống chọi với thiên nhiên để tự tồn mà phải cùng chung sống với nhau', 2),
(10, 1, 'Chính Trị Luận', '118000', 'chinh-tri-luan-outline-28-2-2018-01.jpg', '“Chính trị luận” của Aristotle là một tác phẩm nổi tiếng nhất nói về các khái niệm mà từ đó các quốc gia và chính phủ định hình. Mặc dù chỉ thảo luận về nhà nước và các định chế thời Hy Lạp cổ đại nhưng tác phẩm này của ông đã đặt nền tảng cho khoa học chính trị hiện đại.', 2),
(11, 1, 'Cộng Hòa', '12000', 'sach-cong-hoa.jpg', 'Cộng Hòa của Plato được xem là cột mốc lớn của triết học phương Tây. Mặc dù chủ đề chính là về một nhà nước lý tưởng nhưng nó xoay quanh giáo dục, tâm lý, đạo đức và chính trị. Trong những mục chính của “Cộng hòa”, Plato sử dụng những huyền thoại để khám phá bản chất tự nhiên của thực tế, truyền đạt cái nhìn về sự tiên đoán của con người và vai trò của triết học trong việc thiết lập tự do. Ông tưởng tượng ra một cái hang mà những con người bị xiềng xích từ khi mới sinh ra, chỉ làm bạn với cái bóng của chính mình', 2),
(12, 1, 'Thế Giới Cho Đến Ngày Hôm Qua', '350000', 'sach-the-gioi-cho-den-ngay-hom-qua-196x300.jpg', 'Tác giả của những cuốn sách bestseller: Sụp đổ và Súng, Vi trùng và Thép đã khảo sát lịch sử xã hội loài người để trả lời câu hỏi: Chúng ta có thể học được gì từ các xã hội truyền thống để tạo nên một thế giới tốt đẹp hơn cho tất cả?', 3),
(13, 1, 'Sụp Đổ', '45000', '', 'hân loại sẽ cần ghi nhớ những điều được Jared Diamond tổng kết: “Chúng ta đang tiến rất nhanh trên con đường không bền vững… nên bằng cách này hay cách khác, các vấn đề môi trường của thế giới sẽ được các thế hệ trẻ hiện nay giải quyết.', 2),
(14, 1, 'luật lao động', '270000', 'sach-bo-luat-lao-dong-sua-doi-nam-2019_s1643.jpg', 'sách luật lao động', 3),
(15, 1, 'luật bảo hiểm y tế', '270000', 'sach-luat-bao-hiem-xa-hoi--luat-bao-hiem-y-te-quy-dinh-moi-bao-hiem-xa-hoi-bat-buoc--bao-hiem-that-nghiep_s1586.jpg', 'luật bảo hiểm y tế', 3),
(16, 1, 'Man mác vàm nao', '68000', 'image_195509_1_13066.jpg', 'Tôi viết cuốn sách này là muốn lưu giữ những giá trị thiêng liêng của một miền sông nước đang đứng trước bao biến thiên thế cuộc. Tôi xót xa chứng kiến những con sông nắng mưa bồi lở, bao phen ngậm ngùi nhìn mùa nước nổi vắng bóng cá tôm, cay đắng cùng số phận của những người nông dân bị bứng khỏi quê nhà dạt trôi tứ xứ. Nhưng dù có vật đổi sao dời đến đâu, thì miền Tây vẫn đọng lại trong tôi biết bao đều tốt đẹp. Cái đẹp của tình đất tình người.”', 4),
(17, 1, 'Chu lai', '116000', 'image_195509_1_13045.jpg', 'Người im lặng là câu chuyện về cuộc đời trầm lặng của một nhà tình báo huyền thoại trong chiến tranh Việt Nam qua lời kể của vợ ông. Tuy là một cuốn tiểu thuyết hư cấu, nhưng tác phẩm đã chuyển tải chân thật những thăng trầm của cuộc đời nhà tình báo nổi danh nhất Việt Nam thế kỷ XX. Một con người được thế giới coi trọng và được coi trọng là một \" điệp viên hoàn hảo\"', 4),
(18, 1, 'Án tử một tình yêu', '32000', 'antumottinhyeuthedeathofaloverlWEinSx76.jpg', 'nói về một cái kết cho một tình yêu trong tội lỗi', 5),
(19, 1, 'Bướm báo thù', '42000', 'pngtree-beautiful-butterfly-decoration-illustration-png-image_4528899.jpg', 'Bướm báo thù là một câu chuyện kể về ...', 5),
(20, 1, 'Ngữ văn 9', '23000', 'van_9_1_da146833ce1e4ad7ab716c4d332e8ec8_master.jpg', 'Là SGK dành cho các học sinh lớp 9 và các học sinh đúp', 6),
(21, 1, 'Văn học  12', '28000', 'Ngu-van-12-Tap-2-727193-2-400x564.jpg', 'Đây là sách văn học 12 chuẩn theo bộ giáo dục và NXB Việt Nam', 6),
(22, 1, 'Văn học  11', '23000', 'tải xuống.jfif', 'Sách văn học lớp 11', 6),
(23, 1, 'Truyện ma lúc nửa đêm', '5000000', 'maxresdefault.jpg', 'truyện ma kể lúc 0h', 19),
(25, 1, 'Văn học  10', '120000', '', 'SGK dành cho học sinh lớp 10 ', 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `products`
--

CREATE TABLE `products` (
  `TenSanPham` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `status` tinyint(1) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `products`
--

INSERT INTO `products` (`TenSanPham`, `status`, `id`) VALUES
('Truyện cổ tích', 1, 1),
('Chính trị', 1, 2),
('Pháp luật', 1, 3),
('Tiểu thuyết', 1, 4),
('Trinh thám', 1, 5),
('Văn học', 1, 6),
('Truyện hài hước', 1, 18),
('Truyện kinh dị', 1, 19),
('truyện ma', 1, 20);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `slidepicture`
--

CREATE TABLE `slidepicture` (
  `id` int(11) NOT NULL,
  `HinhAnh` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `slidepicture`
--

INSERT INTO `slidepicture` (`id`, `HinhAnh`) VALUES
(1, '90e23207425cbc7987c85359a36db492.jpg'),
(2, '4081a82e844ef5073b18f51798279d0d.jpg'),
(3, '9527a269acf404b6cecde3a2ea6cc7e0.jpg'),
(4, '093237ac7d13c0c6f0fe024df901ef25.jpg'),
(5, 've-tranh-tuong-mam-non-ba-chu-lon-con.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Email` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `TenHienThi` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `SoDienThoai` int(11) NOT NULL,
  `HinhAnh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `Email`, `Password`, `HoTen`, `TenHienThi`, `SoDienThoai`, `HinhAnh`) VALUES
(2, 'dao.d.minh.190299@gmail.com', 'daoquangvinh1', 'Đào Đức Minh', 'MinhDao', 327614768, NULL),
(4, 'dao.q.vinh.240407@gmail.com', 'daoquangvinh1', 'Đào Quang Vinh', 'VinhDao', 222545212, NULL),
(5, 'admin', '1', 'MinhDao', 'MinhDao', 123, NULL),
(6, 'admin1', 'admin1', 'Minh', 'Minh', 99999999, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `usercustomer`
--

CREATE TABLE `usercustomer` (
  `id` int(11) NOT NULL,
  `Email` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `sodienthoai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `usercustomer`
--

INSERT INTO `usercustomer` (`id`, `Email`, `Password`, `HoTen`, `sodienthoai`) VALUES
(1, 'khachhang1', 'khachhang1', 'Đào Đức Minh', 327614768),
(2, 'khachhang2', 'khachhang2', 'VinhDao', 962154786);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `listsanpham`
--
ALTER TABLE `listsanpham`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `idproducts` (`idproducts`);

--
-- Chỉ mục cho bảng `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `slidepicture`
--
ALTER TABLE `slidepicture`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `usercustomer`
--
ALTER TABLE `usercustomer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `listsanpham`
--
ALTER TABLE `listsanpham`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT cho bảng `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT cho bảng `slidepicture`
--
ALTER TABLE `slidepicture`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `usercustomer`
--
ALTER TABLE `usercustomer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `listsanpham`
--
ALTER TABLE `listsanpham`
  ADD CONSTRAINT `listsanpham_ibfk_1` FOREIGN KEY (`idproducts`) REFERENCES `products` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
