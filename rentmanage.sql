/*
 Navicat MySQL Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : rentmanage

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 25/05/2020 17:57:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building`  (
  `id` int(10) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '楼名',
  `addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '地址',
  `number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '门牌号',
  `user_id` int(10) NULL DEFAULT NULL COMMENT '登记人',
  `watet_fee` decimal(10, 2) NULL DEFAULT NULL COMMENT '水费 元/吨',
  `elc_fee` decimal(10, 2) NULL DEFAULT NULL COMMENT '电费 元/度',
  `del` int(1) NULL DEFAULT 0 COMMENT '删除标志',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dict
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict`  (
  `id` int(10) NOT NULL,
  `type` int(10) NULL DEFAULT NULL COMMENT '字典类型',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '字典名称',
  `value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '字典数值',
  `del` int(1) NULL DEFAULT 0 COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for fee
-- ----------------------------
DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee`  (
  `id` int(10) NOT NULL,
  `rooms` int(10) NULL DEFAULT NULL COMMENT '房号',
  `water` decimal(10, 2) NULL DEFAULT NULL COMMENT '水度',
  `water_fee` decimal(10, 2) NULL DEFAULT NULL COMMENT '水费',
  `elect` decimal(10, 2) NULL DEFAULT NULL COMMENT '电度',
  `elect_fee` decimal(10, 2) NULL DEFAULT NULL COMMENT '电费',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '记录时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for people
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people`  (
  `id` int(10) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '姓名',
  `addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '籍贯',
  `idcard` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '身份证',
  `tel` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '电话',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '性别',
  `rooms` int(10) NULL DEFAULT NULL COMMENT '房号',
  `del` int(1) NULL DEFAULT NULL COMMENT '删除标志',
  `out_time` datetime(0) NULL DEFAULT NULL COMMENT '离开时间',
  `in_time` datetime(0) NULL DEFAULT NULL COMMENT '入住时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rooms
-- ----------------------------
DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms`  (
  `id` int(10) NOT NULL,
  `rooms` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `fee` decimal(10, 2) NULL DEFAULT NULL COMMENT '月租',
  `type` int(10) NULL DEFAULT NULL COMMENT '户型',
  `del` int(1) NULL DEFAULT 0 COMMENT '删除标志',
  `water` decimal(10, 0) NULL DEFAULT NULL COMMENT '水',
  `elect` decimal(10, 0) NULL DEFAULT NULL COMMENT '电',
  `build_id` int(10) NULL DEFAULT NULL COMMENT '楼栋号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '密码',
  `realname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '姓名',
  `tel` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '电话',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '头像',
  `del` int(1) NULL DEFAULT NULL COMMENT '删除标志 0默认 1已禁用',
  `role` int(1) NULL DEFAULT NULL COMMENT '角色0超级管理员1楼栋管理员',
  `rolename` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '角色中文',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin', '超级管理员', '10010', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
