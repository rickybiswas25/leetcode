package may.tenthday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by Deb
 * Date : 06/05/2020.
 *
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 *
 * If the town judge exists, then:
 *
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 *
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 */
public class TownJudgeFinder {

    public int find(int N, int[][] trust) {
        if (N == 1) {
            return 1;
        }
        Set<Integer> byTrust = new HashSet<>();
        Map<Integer, Integer> trusted = new HashMap<>();
        for (int[] ints : trust) {
            byTrust.add(ints[0]);
            trusted.merge(ints[1], 1, Integer::sum);
        }
        return IntStream.rangeClosed(1, N)
                .filter(people -> !byTrust.contains(people))
                .filter(people -> trusted.get(people) != null && trusted.get(people) == N - 1)
                .findFirst()
                .orElse(-1);

    }
}
