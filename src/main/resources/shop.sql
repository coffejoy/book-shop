/*
Navicat MySQL Data Transfer

Source Server         : lookhouse
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2019-02-16 11:59:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `admin_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) NOT NULL,
  `admin_password` varchar(255) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(20) NOT NULL,
  `book_author` varchar(20) NOT NULL,
  `book_price` double(20,0) NOT NULL,
  `book_discount` double(20,0) DEFAULT NULL,
  `book_currprice` double(20,0) NOT NULL,
  `book_publish_time` datetime NOT NULL,
  `book_img` varchar(20) NOT NULL,
  `cate_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_car
-- ----------------------------
DROP TABLE IF EXISTS `t_car`;
CREATE TABLE `t_car` (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`car_id`,`book_id`,`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `cate_id` int(20) NOT NULL AUTO_INCREMENT,
  `cate_name` varchar(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `order_by` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`cate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_excel
-- ----------------------------
DROP TABLE IF EXISTS `t_excel`;
CREATE TABLE `t_excel` (
  `id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `order_id` varchar(100) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `user_address` varchar(255) NOT NULL,
  `order_time` datetime NOT NULL,
  `status` int(11) NOT NULL,
  `total_price` double(11,0) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_item
-- ----------------------------
DROP TABLE IF EXISTS `t_order_item`;
CREATE TABLE `t_order_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) NOT NULL,
  `book_id` bigint(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `book_price` double(11,0) NOT NULL,
  `book_name` varchar(255) NOT NULL,
  `book_currprice` double(11,0) NOT NULL,
  `book_total_price` double(11,0) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
