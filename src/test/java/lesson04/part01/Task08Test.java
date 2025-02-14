package lesson04.part01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.SystemInGatewayUtil;
import util.SystemOutGatewayUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Task08Test {

    private static List<String> collect;

    static {
        String fileName = "./src/main/java/lesson04/part01/Task08.java";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            collect = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void setUp() throws Exception {
        SystemOutGatewayUtil.setCustomOut();
    }

    @After
    public void tearDown() throws Exception {
        SystemOutGatewayUtil.setOriginalOut();
        SystemInGatewayUtil.setOriginalIn();
        SystemOutGatewayUtil.clearOutput();
    }
    @Test
    public void task08ifListCreated() {
        boolean isListCreated = false;
        for (String s : collect) {
            if (s.contains("ArrayList<String>") && s.contains("=new ArrayList"))
                isListCreated = true;
        }
        Assert.assertTrue("Объяви переменную типа список строк и сразу проинициализируй ee.",
                isListCreated);
    }
    @Test
    public void task08KeyboardInputToList() {
        boolean isInputExist = false;
        for (String s : collect) {
            if (s.contains("(int i=0;i<10;i++)") || s.contains("list.add") && s.contains("readLine()")) {
                isInputExist = true;
                break;
            }
        }
        Assert.assertTrue("Программа должна считывать 10 строк с клавиатуры и добавлять их в список",isInputExist);
    }
    @Test
    public void task08OutFromListWithRequire3() {
        boolean isInputExist = false;
        boolean a=false;
        for (String s : collect) {
            if (s.contains("for (int i=0;i<10;i++)") ) {
                isInputExist = true;

            }
            if (isInputExist && s.contains("System.out.println(a.get(i));")) {
                a = true;
                break;
            }
        }
        Assert.assertTrue("Программа должна добавлять строки в начало списка.\n" +
                "Программа должна выводить список на экран, каждое значение с новой строки.",a);
    }
}