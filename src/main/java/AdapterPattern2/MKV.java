package AdapterPattern2;

public class MKV implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MKV File " +filename);
    }
}
