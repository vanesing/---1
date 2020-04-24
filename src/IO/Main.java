package IO;
import java.io.*;


import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;



         //  Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);

        //Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.


         // * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).

          //** Написать метод, проверяющий, есть ли указанное слово в папке





public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("file1.txt", false);
            PrintStream ps = new PrintStream(fos);
            ps.println("Finding somewhere affordable to live in Britain is hard.\n" +
                    " Some parts of the country are cheaper than others, of course, but the cost of renting a home is horrendous, especially in London and the South.\n" +
                    " Normally, the only answer is to share a house or a flat: you get a room of your own, but you have to share the kitchen and bathroom.\n" +
                    " In cities like Oxford and Cambridge, where rooms are scarce, prices will make your eyes water: more than £500 a month. In London, they’re even higher – not far off £700.");

        }catch (IOException exception) {
            System.out.println(exception.getStackTrace());
        }
        try {
            FileOutputStream fos2 = new FileOutputStream("file2.txt", false);
            PrintStream ps = new PrintStream(fos2);
            ps.println("Oxford already seemed expensive when I lived there, and that was almost 40 years ago.\n" +
                    " When I started work after university, my room cost £40 a month – almost 15 per cent of my salary.\n" +
                    " With today’s rents in Oxford, you’d need to earn £40,000 a year if you didn’t want to spend more than 15 per cent on your room.\n" +
                    " But when you finish university, starting salaries are usually between £20,000 and £30,000.");


        }catch (IOException exception) {
            System.out.println(exception.getStackTrace());
        }

        // Обьединение файло в один
        try {
            FileOutputStream fos3 = new FileOutputStream("united.txt", false);


        }catch (IOException exception) {
            System.out.println(exception.getStackTrace());
        }

        List<Path> inputs = Arrays.asList(Paths.get("file1.txt"), Paths.get("file2.txt"));


        Path output = Paths.get("united.txt");


        Charset charset = StandardCharsets.UTF_8;


        for (Path path : inputs) {
            List<String> lines = Files.readAllLines(path, charset);
            Files.write(output,lines,charset, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        }


        // Метод поиска слова
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("united.txt"));
            byte arr[] = new byte[in.available()];
            in.read(arr);
            String text = new String(arr);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String keyword;
            keyword = br.readLine();
            if(keyword.contains("Oxford"))
                keyword = keyword.substring(0,keyword.indexOf("Oxford"));
            if(text.contains(keyword)){
                System.out.println(keyword);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    }


