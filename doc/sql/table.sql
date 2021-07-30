-- ----------------------------
-- database itutopia
-- ----------------------------
CREATE DATABASE IF NOT EXISTS itutopia
DEFAULT CHARACTER SET utf8mb4;
use itutopia;

--
-- Definition of table `user`
-- 用户表
--
DROP TABLE IF EXISTS `user`;
-- user --
CREATE TABLE `user`  (
      `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
      `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名称',
      `birthday` datetime(0) NULL DEFAULT NULL COMMENT '生日',
      `creator` int(0) NULL DEFAULT NULL COMMENT '创建人id',
      `created` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
      `editor` int(0) NULL DEFAULT NULL COMMENT '修改人id',
      `edited` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
      PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;