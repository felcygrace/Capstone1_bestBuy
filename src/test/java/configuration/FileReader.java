package configuration;

public class FileReader {

	public FileReader() {
	}

	public static FileReader get_Instance() {
		FileReader helper = new FileReader();
		return helper;
	}

	public Reader get_InstanceCR() throws Throwable {
		Reader reader = new Reader();
		return reader;

	}

}