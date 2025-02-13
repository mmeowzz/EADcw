-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2025 at 02:56 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bid` varchar(10) NOT NULL,
  `bname` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `publishedyear` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bid`, `bname`, `author`, `publisher`, `publishedyear`) VALUES
('B001', 'Computing Technology and Ethics', 'Emanuelle Burton, Judy Goldsmith, Nicholas Mattei, Cory Siler, and Sara-Jo Swiatek', 'The MIT Press', '2023'),
('B002', 'More Than a Glitch', 'Meredith Broussard ', 'The MIT Press', '2023'),
('B003', 'Working with AI', 'Thomas H. Davenport and Steven M. Miller ', 'The MIT Press', '2022'),
('B004', 'Practicing Trustworthy Machine Learning', 'Yada Pruksachatkun, Matthew Mcateer, and Subho Majumdar ', 'O Reilly Media', '2023'),
('B005', 'AI at the Edge', 'Daniel Situnayake and Jenny Plunkett ', 'O Reilly Media', '2023'),
('B006', 'Digitalization of Financial Services in the Age of Cloud', 'Jamil Mina, Armin Warda, Rafael Marins, and Russ Miles ', 'O Reilly Media', '2023'),
('B007', 'I, Human', 'Tomas Chamorro-Premuzic ', 'Harvard Business Review Press', '2023'),
('B008', 'The Black Technical Object', 'Ramon Amaro', 'Sternberg Press', '2023');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `bid` varchar(10) NOT NULL,
  `stid` varchar(10) NOT NULL,
  `issue` varchar(20) NOT NULL,
  `due` varchar(20) NOT NULL,
  `datereturn` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`bid`, `stid`, `issue`, `due`, `datereturn`) VALUES
('B001', '1001', '09-02-2025', '16-02-2025', 'YES'),
('B008', '1005', '12-02-2025', '14-02-2025', 'NO'),
('B006', '1008', '12-02-2025', '17-02-2025', 'NO'),
('B003', '1004', '12-02-2025', '13-02-2025', 'YES'),
('B001', '1009', '18-02-2025', '20-02-2025', 'NO');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `stid` varchar(10) NOT NULL,
  `stname` varchar(255) NOT NULL,
  `stcontact` int(10) NOT NULL,
  `stcourse` varchar(255) NOT NULL,
  `stbranch` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`stid`, `stname`, `stcontact`, `stcourse`, `stbranch`) VALUES
('1001', 'Chanulya Fernando', 775676552, 'DSE', 'CO'),
('1002', 'June Obrid', 779638495, 'CSE', 'PE'),
('1003', 'Alice Johnson', 779684359, 'CCS', 'PE'),
('1004', 'Bob Smith', 719685229, 'HNDIS', 'KU'),
('1005', 'Charlie Brown', 719866478, 'DSE', 'PE'),
('1006', 'David Wilson', 778964487, 'BSE', 'GA'),
('1007', 'Emma Davis', 726588934, 'BSE', 'GA'),
('1008', 'Frank Martin', 779521669, 'DCSD', 'CO'),
('1009', 'Grace Lee', 779684435, 'BIS', 'MT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `issue`
--
ALTER TABLE `issue`
  ADD KEY `bid` (`bid`),
  ADD KEY `stid` (`stid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`stid`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `issue`
--
ALTER TABLE `issue`
  ADD CONSTRAINT `issue_ibfk_1` FOREIGN KEY (`bid`) REFERENCES `book` (`bid`),
  ADD CONSTRAINT `issue_ibfk_2` FOREIGN KEY (`stid`) REFERENCES `student` (`stid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
