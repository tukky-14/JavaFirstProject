// ■コンパイル
// javac [ファイル名]
// ■実行
// java クラス名

// 配列
class Array {
    public static void main(String[] args) {
        String[] fruits = { "りんご", "ぶどう", "みかん" };

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
    }
}

// 多次元配列
class MultiArray {
    public static void main(String[] args) {
        String[][] fruits = { { "りんご", "ぶどう" }, { "みかん", "ばなな" } };

        System.out.println(fruits[0][0]);
        System.out.println(fruits[0][1]);
        System.out.println(fruits[1][1]);
    }
}