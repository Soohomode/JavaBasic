// 유수호

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Candidate {
    String name;
    String symbol;
    int votes;

    Candidate(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.votes = 0;
    }
}

public class Mini_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 총 투표 수 입력
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int totalVotes = scanner.nextInt();
        if (totalVotes < 1 || totalVotes > 10000) {
            System.out.println("투표 수는 1에서 10000 사이의 값을 입력해야 합니다.");
            return;
        }

        // 2. 후보자 수 및 이름 입력
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int numCandidates = scanner.nextInt();
        if (numCandidates < 2 || numCandidates > 10) {
            System.out.println("후보자 수는 2에서 10 사이의 값을 입력해야 합니다.");
            return;
        }

        ArrayList<Candidate> candidates = new ArrayList<>();
        for (int i = 0; i < numCandidates; i++) {
            System.out.print((i + 1) + "번째 후보자이름을 입력해 주세요.");
            String candidateName = scanner.next();
            candidates.add(new Candidate(candidateName, "기호:" + (i + 1)));
        }

        // 4. 투표 및 결과 출력

        Random random = new Random();
        int voteCount = 0;
        for (int voteNum = 0; voteNum < totalVotes; voteNum++) {
            Candidate randomCandidate = candidates.get(random.nextInt(numCandidates));
            randomCandidate.votes += 1;

            voteCount++;

            if (voteCount % 1 == 0 || voteNum == totalVotes - 1) {
                double progress = ((double) voteCount * 100) / totalVotes;
                System.out.printf("\n[투표진행률]: %.2f%%, %d명 투표 => %s\n", progress, voteCount, randomCandidate.name);
                for (Candidate candidate : candidates) {
                    double percentage = ((double) candidate.votes / (double) (voteCount)) * 100;
                    System.out.printf("[%s] %s:\t %.2f%%\t(투표수: %d)\n", candidate.symbol, candidate.name, percentage, candidate.votes);
                }
            }
        }

        // 5. 최종 결과 및 당선자 출력
        Candidate winner = candidates.get(0);  // 초기에 첫 후보자를 당선자로 설정
        for (Candidate candidate : candidates) {
            if (candidate.votes > winner.votes) {
                winner = candidate;  // 투표 수가 더 많은 후보자를 당선자로 업데이트
            }
        }

        System.out.println("\n[투표결과] 당선인 : " + winner.name);
    }
}
