package Class.Week4.Week4_0512;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
  public List<String> getLines(String fileName) {
    List<String> lines = new LinkedList<>();


    try (BufferedReader br = Files.newBufferedReader(
            Paths.get("C:\\Users\\Administrator\\Downloads\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\new 1.병원정보서비스 2022.10..csv"), StandardCharsets.UTF_8)) {

      String line;
      while ((line = br.readLine()) != null) {
        lines.add(line);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return lines;
  }

  public static void main(String[] args) {

  }


}
