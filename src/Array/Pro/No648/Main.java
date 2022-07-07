package Array.Pro.No648;

import java.util.*;

/**
 * @author 钟书恒
 * @ClassName main
 * @date 2022/7/7 15:07
 * @Version 1.0
 * <p>
 * 在英语中，我们有一个叫做 词根(root) 的概念，可以词根后面添加其他一些词组成另一个较长的单词——我们称这个词为 继承词(successor)。
 * 例如，词根an，跟随着单词 other(其他)，可以形成新的单词 another(另一个)。
 * 现在，给定一个由许多词根组成的词典 dictionary 和一个用空格分隔单词形成的句子 sentence。你需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
 * <p>
 * 你需要输出替换之后的句子。
 */
public class Main {
    public static void main(String[] args) {
        SolutionFun2 solution = new SolutionFun2();
        String sentence = "aadsfasf absbs bbab cadsfafs";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("a");
        dictionary.add("b");
        dictionary.add("c");
        String s = solution.replaceWords(dictionary, sentence);
        System.out.println(s);
    }
}

class SolutionFun1 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Object[] sentenceArray = Arrays.stream(sentence.split(" ")).toArray();
        System.out.println(Arrays.toString(sentenceArray));
        List<String> newSentence = new ArrayList<>();
        String newString = "";

        for (Object s : sentenceArray) {
            for (String includeString : dictionary) {
                //查看句子单词是否包含指定字符串
                newString = s.toString();
                if (s.toString().contains(includeString)) {
                    if (newString.length() > includeString.length()) {
                        newString = includeString;
                    }
                    if (s.toString().startsWith(includeString)) {
                        newString = includeString;
                        break;
                    }
                } else {
                    newString = s.toString();
                }
            }
            newSentence.add(newString);
        }
        StringBuilder rs = new StringBuilder("");
        for (String s : newSentence) {
            rs.append(s).append(" ");
        }
        rs = new StringBuilder(rs.toString().substring(0, rs.toString().length() - 1));
        return rs.toString();
    }
}

class SolutionFun2 {
    public String replaceWords(List<String> dictionary, String sentence) {
        // 将词根保存在哈希集合当中
        Set<String> dic = new HashSet<>(dictionary);
        // 将句子切割
        String[] words = sentence.split(" ");
        // 循环遍历句子单词
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // 循环遍历单词的前缀
            for (int j = 0; j < word.length(); j++) {
                // 将前缀逐个切割比较
                if (dic.contains(word.substring(0, j + 1))) {
                    words[i] = word.substring(0,j+1);
                    break;
                }
            }
        }
        return String.join(" ",words);
    }
}