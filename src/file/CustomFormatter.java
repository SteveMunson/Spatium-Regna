package file;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
	private static final String format = "[%1$tF %1$tT] [%2$-4s] %3$s %n";

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return String.format(format, record.getMillis(), record.getLevel().getLocalizedName(), record.getMessage());
	}

}
