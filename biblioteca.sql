-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 23-01-2021 a las 17:25:04
-- Versión del servidor: 8.0.21
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejemplo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `biblioteca`
--

CREATE TABLE `biblioteca` (
  `id` int NOT NULL,
  `nombre` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `autor` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `categoria` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `año` int NOT NULL,
  `ISBN` varchar(16) COLLATE utf8mb4_general_ci NOT NULL,
  `estado` enum('disponible','prestado','reservado','reparación') COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `biblioteca`
--

INSERT INTO `biblioteca` (`id`, `nombre`, `autor`, `categoria`, `año`, `ISBN`, `estado`) VALUES
(1, 'La Odisea', 'Homero', 'Clásico', -850, '5345349709', 'prestado'),
(2, 'La Odisea', 'Homero', 'Clásico', -800, '423423432', 'prestado'),
(3, 'El Buscón', 'Francisco Quevedo', 'Novela', 1626, '4546542417', 'disponible'),
(4, 'Don Quijote de la Mancha', 'Miguel de Cervantes', 'Novela', 1615, '937816592', 'reparación'),
(5, 'Harry Potter y la piedra Filosofal', 'JK Rowling', 'Fantasia', 1998, '42242352417', 'prestado'),
(6, 'Romeo y Julieta', 'William Shakespeare', 'Clásico', 1597, '212389182', 'reparación'),
(9, 'El prisionero de Azkaban', 'JK Rowling', 'Fantasia', 2002, '73216491', 'disponible');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
