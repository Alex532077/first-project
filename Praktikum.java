class Praktikum {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++){ // В тренировке должно выполниться 5 кругов
        System.out.println("Круг " + i);
        if (i % 2==0){  // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
        for (int j = 1; j <=5; j++)// Если да, то присесть 5 раз
        System.out.println("  Приседаем " + j);
        }
        else if (i % 1==0) {
            for (int k=1; k <=3; k=k+1)// Иначе нужно отжаться 3 раза
        System.out.println("  Отжимаемся " + k);}
        
            for (int n=1; n<=7; n++) // Независимо от номера круга качаем пресс 7 раз
        System.out.println("  Качаем пресс " + n);
        
		for (int m=1; m<=1; m++)// Небольшое подбадривание в конце каждого круга
        System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}