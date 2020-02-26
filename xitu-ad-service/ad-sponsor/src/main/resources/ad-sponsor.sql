-- xitu-ad database
drop DATABASE xitu_ad_data;
CREATE DATABASE xitu_ad_data character set utf8;

use xitu_ad_data;

-- User table
CREATE TABLE `ad_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'auto_increment_primary_key',
  `username` varchar(128) NOT NULL DEFAULT '' COMMENT 'user_name',
  `token` varchar(256) NOT NULL DEFAULT '' COMMENT 'Auto_generate_token',
  `user_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'user_status',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'create_time',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'update_time',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='user_info_table';


-- Promotion plan
CREATE TABLE `ad_plan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'auto_increment_primary_key',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'mark_current_user',
  `plan_name` varchar(48) NOT NULL COMMENT 'ad_plan_name',
  `plan_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'ad_plan_status',
  `start_date` datetime NOT NULL COMMENT 'ad_plan_start_time',
  `end_date` datetime NOT NULL COMMENT 'ad_plan_end_time',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'create_time',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='ad_plan_table';


-- PromotionUnit table
CREATE TABLE `ad_unit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'auto_increment_primary_key',
  `plan_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'PromotionUnit_id',
  `unit_name` varchar(48) NOT NULL COMMENT 'PromotionUnit_name',
  `unit_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'PromotionUnit_statues',
  `position_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'ad_type',
  `budget` bigint(20) NOT NULL COMMENT 'budget',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'create_time',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='PromotionUnit_table';


-- Creative table
CREATE TABLE `ad_creative` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'auto_increment_primary_key',
  `name` varchar(48) NOT NULL COMMENT 'Creative_name',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'type',
  `material_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'sub-type(image, video, audio',
  `height` int(10) NOT NULL DEFAULT '0' COMMENT 'height',
  `width` int(10) NOT NULL DEFAULT '0' COMMENT 'width',
  `size` bigint(20) NOT NULL DEFAULT '0' COMMENT 'size, unit is KB',
  `duration` int(10) NOT NULL DEFAULT '0' COMMENT 'duration, only video does not equal to 0',
  `audit_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'audit_status',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'mark current user',
  `url` varchar(256) NOT NULL COMMENT 'address',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'create_time',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='Creative_table';


-- Associative table of Creative and promotionUnit
CREATE TABLE `creative_unit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `creative_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'creative id',
  `unit_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'ad_unit id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='Associative table of Creative and promotionUnit';


-- promotionUnit keyword Feature
CREATE TABLE `ad_unit_keyword` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unit_id` int(11) NOT NULL COMMENT 'ad_unit id',
  `keyword` varchar(30) NOT NULL COMMENT 'keyword',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='promotionUnit & keyword Feature';


-- promotionUnit Creative Feature
CREATE TABLE `ad_unit_it` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unit_id` int(11) NOT NULL COMMENT 'ad_unit id',
  `it_tag` varchar(30) NOT NULL COMMENT 'tag',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='promotionUnit & Creative Feature';


-- promotionUnit district Feature
CREATE TABLE `ad_unit_district` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unit_id` int(11) NOT NULL COMMENT 'ad_unit id',
  `province` varchar(30) NOT NULL COMMENT 'province',
  `city` varchar(30) NOT NULL COMMENT 'city',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='promotionUnit & district Feature';
