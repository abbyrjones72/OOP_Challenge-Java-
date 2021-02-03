package org.medical.surgery.main;

import org.medical.surgery.organs.Eye;
import org.medical.surgery.organs.Heart;
import org.medical.surgery.organs.Skin;
import org.medical.surgery.organs.Stomach;
import org.medical.surgery.patients.Patient;

import java.util.Scanner;

// TODO: this could be a killer app for a small medical practice if it
// TODO: could connect to HL7 information and other databases, as well as be secure
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = false;

        Patient patient1 = new Patient("Abby Jones",
                48,
                new Eye("Left Eye", "Short-sighted.", "Blue", true),
                new Eye("Right Eye", "Normal.", "Blue", false),
                new Heart("Normal", "Normal", 90),
                new Stomach("Stomach", "Upset Tummy", false),
                new Skin("Skin", "Clear complexion", "Black", 9));

        System.out.println("Patient: " + patient1.getName());
        System.out.println("Age: " + patient1.getAge());

        while(!isRunning) {


            System.out.println("Choose an organ:" +
                    "\n\t 1. Left Eye" +
                    "\n\t 2. Right Eye" +
                    "\n\t 3. Heart" +
                    "\n\t 4. Stomach" +
                    "\n\t 5. Skin" +
                    "\n\t 6. Quit");

            int menuSelection = sc.nextInt();

            switch(menuSelection) {
                case 1:
                    patient1.getLeftEye().getDetails();
                    if (patient1.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. Close Eye");
                        if(sc.nextInt() == 1) {
                            patient1.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open Eye");
                        if(sc.nextInt() == 1) {
                            patient1.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient1.getRightEye().getDetails();
                    if (patient1.getRightEye().isOpen()) {
                        System.out.println("\t\t1. Close Eye");
                        if(sc.nextInt() == 1) {
                            patient1.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open Eye");
                        if(sc.nextInt() == 1) {
                            patient1.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient1.getHeart().getDetails();
                    System.out.println("\t\t1. Change Heart Rate");
                    if(sc.nextInt() == 1) {
                        System.out.println("Enter new heart rate");
                        int newHeartRate = sc.nextInt();
                        patient1.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to " + patient1.getHeart().getRate());
                    }
                    break;
                case 4:
                    patient1.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(sc.nextInt() == 1) {
                        patient1.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient1.getSkin().getDetails();
                    break;

                default:
                    isRunning = true;
                    System.out.println("Chart has ended.");
                    break;
            }
        }
    }
}
