package ua.step.example.part1.array;

import java.util.Arrays;

/**
 * 
 * Массив - это ссылочный тип. Это значит, что на один массив может указывать
 * несколько ссылок, через которые можно менять значение в исходном массиве. 
 *
 */
public class Task10 {
	public static void main(String[] args) {
		int[] mas1 = { 1, 1, 1 };
		int[] mas2 = mas1; // присвоение ссылки
		mas2[0] = 2; // меняем значение первого элемента массива черз вторую ссылку
		int[] mas3 = mas2; // присвоение ссылки
		mas3[2] = 0; // меняем значение элемента черз третью ссылку
		System.out.println(Arrays.toString(mas1)); // вывод содержимого массива через ссылку 1
	}
}