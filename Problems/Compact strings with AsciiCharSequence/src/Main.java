import java.util.Arrays;

class AsciiCharSequence implements CharSequence {
    private byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    public byte[] getArray() {
        return array;
    }

    @Override
    public int length() {
        return getArray().length;
    }

    @Override
    public char charAt(int index) {
        return (char) getArray()[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(getArray(), start, end));
    }

    @Override
    public String toString(){
        return new String(getArray());
    }
}