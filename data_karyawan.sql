-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2019 at 05:44 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `input_data_karyawan`
--

CREATE TABLE `input_data_karyawan` (
  `nip` varchar(15) NOT NULL,
  `nama` varchar(15) NOT NULL,
  `Jabatan` varchar(15) NOT NULL,
  `Jenis_kelamin` varchar(15) NOT NULL,
  `agama` varchar(15) NOT NULL,
  `status` varchar(15) NOT NULL,
  `alamat` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `input_data_karyawan`
--

INSERT INTO `input_data_karyawan` (`nip`, `nama`, `Jabatan`, `Jenis_kelamin`, `agama`, `status`, `alamat`) VALUES
('65745', 'rina', 'mahasiswi', 'perempuan', 'Islam', 'belum menikah', 'sad');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
