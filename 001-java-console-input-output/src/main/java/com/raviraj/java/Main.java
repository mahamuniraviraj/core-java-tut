/**
 *
	001-java-console-input-output  Main.java
	These are my sample programs to illustrate
	any programming language, library, framework and/or technology
    Copyright (C) 2017 raviraj

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */
package com.raviraj.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Illustrates Java console input and output
 *
 * @author raviraj
 * @date Jul 24, 2017
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//output to console
		System.out.println("Hello World !!!");

		System.out.println("Enter some text to scan and press enter ::");

		//Initialize scanner to take input from console
		Scanner scanner = new Scanner(System.in);

		// scanner reads a line  from console
		String input = scanner.nextLine();

		System.out.println(" Input :: " + input);


        //Another way to scan

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter some text to input and press enter :::: ");

            String input1 = reader.readLine();

            System.out.println(" Input :: " + input);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //Another way to scan

        System.out.println("Enter another text to scan and press enter ::");

//		String input2 = System.console().readLine();

//		System.out.println(" Another input :: "+input2);


		scanner.close();

	}

}
