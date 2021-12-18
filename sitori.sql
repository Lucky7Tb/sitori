-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 18, 2021 at 05:54 PM
-- Server version: 10.6.4-MariaDB-log
-- PHP Version: 7.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `id` int(11) NOT NULL,
  `item_category_id` int(11) NOT NULL,
  `item_storage_id` int(11) NOT NULL,
  `item_good_condition_ammount` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp(),
  `item_name` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`id`, `item_category_id`, `item_storage_id`, `item_good_condition_ammount`, `created_at`, `updated_at`, `item_name`) VALUES
(2, 1, 1, 100, '2021-12-08 07:47:14', '2021-12-08 07:47:14', 'Hp'),
(3, 1, 1, 90, '2021-12-08 07:47:30', '2021-12-08 07:47:29', 'Laptop');

-- --------------------------------------------------------

--
-- Table structure for table `item_category`
--

CREATE TABLE `item_category` (
  `id` int(11) NOT NULL,
  `item_category_name` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_category`
--

INSERT INTO `item_category` (`id`, `item_category_name`, `created_at`, `updated_at`) VALUES
(1, 'Elektronik', '2021-11-08 16:50:36', '2021-11-08 16:50:36');

-- --------------------------------------------------------

--
-- Table structure for table `item_in`
--

CREATE TABLE `item_in` (
  `id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `item_in_ammount` int(11) NOT NULL,
  `description` text NOT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item_out`
--

CREATE TABLE `item_out` (
  `id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `item_out_ammount` int(11) NOT NULL,
  `description` text NOT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_out`
--

INSERT INTO `item_out` (`id`, `item_id`, `item_out_ammount`, `description`, `created_at`, `updated_at`) VALUES
(7, 3, 10, 'ddwwd', '2021-12-18 12:59:57', '2021-12-18 12:59:57');

-- --------------------------------------------------------

--
-- Table structure for table `last_activity`
--

CREATE TABLE `last_activity` (
  `id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `ammount` int(11) NOT NULL,
  `description` text NOT NULL,
  `status` enum('BARANG_MASUK','BARANG_KELUAR') NOT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `last_activity`
--

INSERT INTO `last_activity` (`id`, `item_id`, `ammount`, `description`, `status`, `created_at`, `updated_at`) VALUES
(2, 3, 10, 'ddwwd', 'BARANG_KELUAR', '2021-12-18 12:59:57', '2021-12-18 12:59:57');

-- --------------------------------------------------------

--
-- Table structure for table `storage`
--

CREATE TABLE `storage` (
  `id` int(11) NOT NULL,
  `storage_name` varchar(80) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `storage`
--

INSERT INTO `storage` (`id`, `storage_name`, `created_at`, `updated_at`) VALUES
(1, 'Gudang 1', '2021-11-08 16:50:47', '2021-11-08 16:50:47');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `item_category_id` (`item_category_id`),
  ADD KEY `item_storage_id` (`item_storage_id`),
  ADD KEY `item_name` (`item_name`);

--
-- Indexes for table `item_category`
--
ALTER TABLE `item_category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `item_in`
--
ALTER TABLE `item_in`
  ADD PRIMARY KEY (`id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `item_out`
--
ALTER TABLE `item_out`
  ADD PRIMARY KEY (`id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `last_activity`
--
ALTER TABLE `last_activity`
  ADD PRIMARY KEY (`id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `storage`
--
ALTER TABLE `storage`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `item_category`
--
ALTER TABLE `item_category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `item_in`
--
ALTER TABLE `item_in`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `item_out`
--
ALTER TABLE `item_out`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `last_activity`
--
ALTER TABLE `last_activity`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `storage`
--
ALTER TABLE `storage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `FK_ITEM_TO_ITEM_CATEGORY` FOREIGN KEY (`item_category_id`) REFERENCES `item_category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_ITEM_TO_STORAGE` FOREIGN KEY (`item_storage_id`) REFERENCES `storage` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `item_in`
--
ALTER TABLE `item_in`
  ADD CONSTRAINT `FK_ITEM_IN_TO_ITEM` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `item_out`
--
ALTER TABLE `item_out`
  ADD CONSTRAINT `FK_ITEM_OUT_TO_ITEM` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `last_activity`
--
ALTER TABLE `last_activity`
  ADD CONSTRAINT `FK_LAST_ACTIVITY_TO_ITEM` FOREIGN KEY (`id`) REFERENCES `item` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
