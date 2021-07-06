package com.metanit.hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/** https://www.hackerrank.com/challenges/the-grid-search/problem */
class Result {

    /*
     * Complete the 'gridSearch' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY G
     *  2. STRING_ARRAY P
     */

    public static String gridSearch(List<String> G, List<String> P) {
        char leftTop = P.get(0).charAt(0);

        for (int i = 0; i < G.size(); i++) {
            for (int j = 0; j < G.get(i).length(); ++j) {
                if (G.get(i).charAt(j) == leftTop) {
                    if(checkGContainsP(G, P, i, j)) {
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }

    private static boolean checkGContainsP(List<String> G, List<String> P, int i, int j) {
        if (!(G.size() >= P.size() + i && G.get(i).length() >= P.get(0).length() + j)) {
            return false;
        }

        for (int x = 0; x < P.size(); ++x) {
            for (int y = 0; y < P.get(x).length(); ++y) {
                if (!(P.get(x).charAt(y) == G.get(i + x).charAt(j + y))) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class GridSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int R = Integer.parseInt(firstMultipleInput[0]);

                int C = Integer.parseInt(firstMultipleInput[1]);

                List<String> G = IntStream.range(0, R).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                        .collect(toList());

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int r = Integer.parseInt(secondMultipleInput[0]);

                int c = Integer.parseInt(secondMultipleInput[1]);

                List<String> P = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                        .collect(toList());

                String result = Result.gridSearch(G, P);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
