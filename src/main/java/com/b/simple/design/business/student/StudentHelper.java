package com.b.simple.design.business.student;

public class StudentHelper {

    /* PROBLEM 1 */
    /*
     * You get a grade B if marks are between 51 and 80 (both inclusive).
     * Except for Maths where the upper limit is increased by 10.
     */
    public static final int MAX_MARKS = 80;
    public static final int MIN_MARKS = 51;
    public static final int MATHS_BONUS = 10;

    public boolean isGradeB(int marks, boolean isMaths) {
        return marks >= MIN_MARKS && marks <= (isMaths ? MAX_MARKS + MATHS_BONUS : MAX_MARKS);
    }

    /* PROBLEM 2 */
	/*
	You are awarded a grade based on your marks.
	Grade A = 91 to 100, Grade B = 51 to 90, Otherwise Grade C
	Except for Maths where marks to get a Grade are 5 higher than required for other subjects.
	*/

    public final int MIN_GRADE_A = 91;
    public final int MIN_GRADE_B = 51;
    public final int MATHS_GRADE_BONUS = 5;

    public String getGrade(int mark, boolean isMaths) {
        if (isGradeA(mark, isMaths)) return "A";
        if (isBGrade(mark, isMaths)) return "B";
        return "C";
    }

    private boolean isGradeA(int mark, boolean isMaths) {
        return mark >= (isMaths ? MIN_GRADE_A + MATHS_GRADE_BONUS : MIN_GRADE_A);
    }

    private boolean isBGrade(int mark, boolean isMaths) {
        return mark >= (isMaths ? MIN_GRADE_B + MATHS_GRADE_BONUS : MIN_GRADE_B) && mark < (isMaths ? MIN_GRADE_A + MATHS_GRADE_BONUS : MIN_GRADE_A);
    }

    /*  PROBLEM 3
     * You and your Friend are planning to enter a Subject Quiz.
     * However, there is a marks requirement that you should attain to qualify.
     *
     * Return value can be YES, NO or MAYBE.
     *
     * YES If either of you are very good at the subject(has 80 or more marks)
     * However, there is an exception that if either of you is not good in the subject(20 or less marks), it is NO.
     * In all other conditions, return MAYBE.
     *
     * However, the definition for good and not good are 5 marks higher if the subject is Mathematics.
     *
     * marks1 - your marks
     * marks2 - your friends marks
     */

    public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
        if ((isMaths ? marks1 <= 25 : marks1 <= 20)
                || (isMaths ? marks2 <= 25 : marks2 <= 20)) return "NO";
        if ((isMaths ? marks1 >= 85 : marks1 >= 80)
                || (isMaths ? marks2 >= 85 : marks2 >= 80)) return "YES";
        return "MAYBE";
    }

}