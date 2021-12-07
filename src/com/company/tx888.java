package com.company;

public class tx888 {
    public int java;
    public int c;
    public int db;


    }


    /**
     * ScoreCalc类
     */
    public class ScoreCalc {
        int java ;   // java 成绩
        int c ;      //c 成绩
        int db;      //db 成绩
        /**
         *计算总成绩
         */
        public int  calcTotalScore() {
            int total = java + c + db;
            return total;
        }
        /**
         * 显示总成绩
         */
        public void showTotalScore() {
            System.out.println("总成绩是：" + calcTotalScore());
        }
        /**
         * 计算平均成绩
         */
        public double calcAvg() {
            double avg = ( java + c + db) / 3;
            return avg;
        }
        /**
         * 显示平均水平
         */
        public  void showAvg() {
            System.out.println("平均成绩是：" + calcAvg());
        }
    }
}
