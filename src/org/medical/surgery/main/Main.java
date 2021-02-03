package org.medical.surgery.main;

import org.medical.surgery.charts.Chart;
import org.medical.surgery.patients.Patient;

import java.util.Scanner;

// TODO: this could be a killer app for a small medical practice if it
// TODO: could connect to HL7 information and other databases, as well as be secure
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Chart abbyChart = new Chart(new Patient("Abby Jones", 48));
        System.out.println("Patient: " + abbyChart.getName());
        System.out.println("Age: " + abbyChart.getAge());

        System.out.println(buildMenu());
        int menuSelection = sc.nextInt();


        switch(menuSelection) {
            case 1:
                System.out.println("Left Eye");
                break;
            case 2:
                System.out.println("Right Eye");
                break;
            case 3:
                System.out.println("Heart");
                break;
            case 4:
                System.out.println("Stomach");
                break;
            case 5:
                System.out.println("Skin");
                break;
            default:
                break;

        }
    }

    // TODO: is there a better way to do this?
    public static String buildMenu() {
        boolean isRunning = false;
        while(!isRunning) {

            String menu = "Choose an organ:" +
                    "\n\t 1. Left Eye" +
                    "\n\t 2. Right Eye" +
                    "\n\t 3. Heart Eye" +
                    "\n\t 4. Stomach Eye" +
                    "\n\t 5. Skin" +
                    "\n\t 6. Quit";
            return menu;
        }

    }

}
