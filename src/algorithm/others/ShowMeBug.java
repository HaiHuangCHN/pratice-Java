//package algorithm;
//
//// 可以引⼊的库和版本相关请参考 “环境说明”
//// 请勿更改 `ShowMeBug` 类名以防执⾏失败
///**
// * TODO Fill in desc
// *
// * @author haihuang95@zto.com
// * @version 0.1.0
// * @date 2023/6/20 17:31
// * @since 0.1.0
// */
//public class ShowMeBug {
//
//    /**
//     * @param inputString 字符串
//     * @return 字符串
//     */
//    public String solution(String inputString) {
//        char[] charArray = inputString.toCharArray();
//        for (char c : charArray) {
//            if ("(".equals(c)) {
//                reverseSequence();
//            }
//        }
//        return;
//    }
//
//    private void reverseSequence(char[] charArray) {
//        for (int i = 0, j = charArray.length - 1; i < j; ++i, --j) {
//            char temp = charArray[i];
//            charArray[i] = charArray[j];
//            charArray[j] = temp;
//        }
//    }
//
//}
