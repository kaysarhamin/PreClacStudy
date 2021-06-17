import java.lang.reflect. * ;
import java.util. * ;
public class PreCalcStudy {
    public static void main(String[] args) {



        Scanner t = new Scanner(System. in );
        System.out.println("Welcome to precalculus study guide. There are servel important concepts that you will definitely need to know for your upcoming class. sections have different chapters that has multiple flash card for you to read. Please chose the section you would like to go to. type the number associated with the sections.  [1] section 1, [2] section 2");
        try{
            Thread.sleep(8*60*2);
        } catch (Exception e) {
            System.out.print("");
        }


        String ts = t.nextLine();
        int selection = Integer.parseInt(ts);

        if(selection == 1) {
            System.out.println(" Great. There are 6 chapters in this section. The first chapter is 9.1. To move to the next chapter type 'next' . ");
            System.out.println("");
            for (int i = 0; i < Section1.chapter9.length; i++) {
                try {
                    System.out.print(Section1.chapter9[i]);
                    System.out.println("");
                    Thread.sleep(10 * 60 * 2);
                } catch (Exception e) {
                    System.out.print("");
                }

            }
            System.out.println("");


            Scanner s = new Scanner(System.in);
            String chapter9_2Next = s.nextLine();

            if (chapter9_2Next.equals("next")) {
                System.out.println(" Chapter 9.3 ");
                for (int i = 0; i < Section1.chapter9_3.length; i++) {
                    try {
                        System.out.println(Section1.chapter9_3[i]);
                        Thread.sleep(8 * 60 * 2);
                    } catch (Exception e) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }

            Scanner e = new Scanner(System.in);
            String chapter2_1Next = e.nextLine();

            if (chapter2_1Next.equals("next")) {
                for (int i = 0; i < Section1.chapter2_1.length; i++) {
                    try {
                        System.out.println(Section1.chapter2_1[i]);
                        Thread.sleep(8 * 60 * 2);
                    } catch (Exception f) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }

            Scanner r = new Scanner(System.in);
            String chapter2_6Next = r.nextLine();

            if (chapter2_6Next.equals("next")) {
                for (int i = 0; i < Section1.chapter2_6.length; i++) {
                    try {
                        System.out.println(Section1.chapter2_6[i]);
                        Thread.sleep(8 * 60 * 2);
                    } catch (Exception f) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }


            Scanner m = new Scanner(System.in);
            String chapter4_1Next = m.nextLine();

            if (chapter4_1Next.equals("next")) {
                for (int i = 0; i < Section1.chapter4_1.length; i++) {
                    try {
                        System.out.println(Section1.chapter4_1[i]);
                        Thread.sleep(8 * 60 * 2);
                    } catch (Exception f) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }

            Scanner o = new Scanner(System.in);
            String chapter4_5Next = o.nextLine();

            if (chapter4_5Next.equals("next")) {
                for (int i = 0; i < Section1.chapter4_5.length; i++) {
                    try {
                        System.out.println(Section1.chapter4_5[i]);
                        Thread.sleep(8 * 60 * 2);
                    } catch (Exception f) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }

            System.out.println(" great you finished the study giude. Now lets quiz you to see if you undertsood the concepts ");
            boolean sans1=false;
            boolean sans2=false;
            boolean sans3=false;
            boolean sans4=false;
            int section2Score=0;
            GUI question1 = new GUI(640, 480, "question 1. what is the standrad form of a circle", "(x-h)^2", "(x-h)^2 + (y-k)^2= r^2", "(y-h)^2", "(idk");
            question1.setUpGUI();
            question1.setUpButtonListeners();

while (question1.getAns()<=0)
{
    System.out.println("");


}
            if(question1.getAns() == 2) {
                sans1 = true;
            }
            if (question1.getAns() > 0) {
                GUI question2 = new GUI(640, 480, "question 2. what is the equation of a hyperbola?", "(x-h)^2/a^2  -  (y-k)^2/b^2 = 1", "(x-h)^2 + (y-k)^2= r^2", "y=k+-a(x-h)/b", "y=k+-b(x-h)/a");
                question2.setUpGUI();
                question2.setUpButtonListeners();
                while (question2.getAns()<=0) {
                    System.out.println("");
                }
                if(question2.getAns() == 1) {
                    sans2 = true;
                }
                if (question2.getAns() > 0) {
                    GUI question3 = new GUI(640, 480, "question 3. Radian is about ..... degrees", "63.55", "62", "57.2958", "69.3644");
                    question3.setUpGUI();
                    question3.setUpButtonListeners();
                    while (question3.getAns()<=0) {
                        System.out.println("");
                    }
                    if(question3.getAns() == 3) {
                        sans3 = true;
                    }
                        if (question3.getAns() > 0) {
                        GUI question4 = new GUI(640, 480, "question 4. what is an amplitude", "a", "the slope of the function", " represents half the distance between the maximum and minimum", "the value that makes the graph goes up and down");
                        question4.setUpGUI();
                        question4.setUpButtonListeners();
                            while (question4.getAns()<=0) {
                                System.out.println("");
                            }
                            if(question4.getAns() == 3) {
                                sans4 = true;
                            }
                                if (question4.getAns() > 0) {

                            System.out.println(" great job lets see how you did. To go to the other section, restart the game.");
                                    System.out.println(" question 1"+ sans1 + "\n question 2" + sans2 + "\n question 3"+ sans3 + "\n question 4"+ sans4);


                        }

                    }
                }
            }


        }

        if(selection == 2) {
            System.out.println(" Great. There are 4 chapters in this section. The first chapter is 6.1. To move to the next chapter type 'next' ");
            System.out.println("");

            for (int i = 0; i < Section2.chapter6_1.length; i++) {
                try {
                    System.out.print(Section2.chapter6_1[i]);
                    System.out.println("");
                    Thread.sleep(10 * 60 * 2);
                } catch (Exception e) {
                    System.out.print("");
                }

            }
            System.out.println("");
        }


            Scanner s = new Scanner(System.in);
            String chapter6_1Next = s.nextLine();

        if (chapter6_1Next.equals("next")) {
            for (int i = 0; i < Section2.chapter6_2.length; i++) {
                try {
                    System.out.print(Section2.chapter6_2[i]);
                    System.out.println("");
                    Thread.sleep(10 * 60 * 2);
                } catch (Exception e) {
                    System.out.print("");
                }

            }
            System.out.println("");
        }


            Scanner o = new Scanner(System.in);
            String chapter6_2Next = o.nextLine();
        if (chapter6_2Next.equals("next")) {
            for (int i = 0; i < Section2.chapter6_5.length; i++) {
                try {
                    System.out.print(Section2.chapter6_5[i]);
                    System.out.println("");
                    Thread.sleep(10 * 60 * 2);
                } catch (Exception e) {
                    System.out.print("");
                }

            }
            System.out.println("");
        }


            Scanner g = new Scanner(System.in);
            String chapter6_5Next = g.nextLine();
        if (chapter6_5Next.equals("next")) {
            for (int i = 0; i < Section2.chapter5_5.length; i++) {
                try {
                    System.out.print(Section2.chapter5_5[i]);
                    System.out.println("");
                    Thread.sleep(10 * 60 * 2);
                } catch (Exception e) {
                    System.out.print("");
                }

            }
            System.out.println("");
        }

            System.out.println(" great you finished the study giude. Now lets quiz you to see if you undertsood the concepts ");

            boolean ans1=false;
            boolean ans2=false;
            boolean ans3=false;
            boolean ans4=false;
            GUI squestion1 = new GUI(640, 480, "question 1. which triangle has no right angle", "right triangle", "acute triangle ", "oblique triangles ", "idk");
            squestion1.setUpGUI();
            squestion1.setUpButtonListeners();

            while (squestion1.getAns()<=0)
            {
                System.out.println("");


            }
            if(squestion1.getAns()==3)
            {
                ans1=true;
            }

            if (squestion1.getAns() > 0) {
                GUI squestion2 = new GUI(640, 480, "question 2. what is the standard form for Law of cosine?", "(x-h)^2/a^2  -  (y-k)^2/b^2 = 1", "a/sinA = b/sinB = c/sinC", "sin2u = 2 sin u cos u", "a^2=b^2+c^2 - 2bc cosA");
                squestion2.setUpGUI();
                squestion2.setUpButtonListeners();
                while (squestion2.getAns() <= 0) {
                    System.out.println("");
                }
                 if (squestion2.getAns() == 4) {
                    ans2 = true;
                }
                if (squestion2.getAns() > 0) {
                    GUI squestion3 = new GUI(640, 480, "question 3. what are the two Multiple-Angle Formulas?", "cosine and sine", "double-angle and half-angle", "complex number", "law of cosine and law of sine");
                    squestion3.setUpGUI();
                    squestion3.setUpButtonListeners();
                    while (squestion3.getAns() <= 0) {
                        System.out.println("");
                    }
                    if (squestion3.getAns() == 2) {
                        ans3 = true;
                    }
                    if (squestion3.getAns() > 0) {
                        GUI squestion4 = new GUI(640, 480, "question 4. The trigonometric form of the complex number is given by ?", "cos^2 u = 1+cos2u/2", "cos2u= 1- 2 sin^2u", "r(cosx + iSinx) ", "cosA = (b^2 + c^2 -a^2 ) / 2bc");
                        squestion4.setUpGUI();
                        squestion4.setUpButtonListeners();
                        while (squestion4.getAns() <= 0) {
                            System.out.println("");
                        }
                        if (squestion4.getAns() == 3) {
                            ans4 = true;
                        }
                        if (squestion4.getAns() > 0) {
                            System.out.println(" great, lets see how you did. To go to the other section, restart the game.");
                            System.out.println( " question 1"+ ans1 + "\n question 2 " + ans2 + "\n question 3" + ans3 + "\nquestion 4" + ans4);
                        }
                    }
                }
            }
        }






        }




