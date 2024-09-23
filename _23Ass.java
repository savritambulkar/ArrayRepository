import java.io.FileInputStream;
import java.io.FileNotFoundException;
class fileError {
void checkFile() throws FileNotFoundException {
FileInputStream ob = new FileInputStream("z://zyx.txt");
}
}
public class _23Ass {
public static void main(String[] args) {
fileError ob = new fileError();
try {
ob.checkFile();
} catch (FileNotFoundException er) {
er.printStackTrace();
}

}
}