package com.sharda.entity;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateAndTime {

	public static Timestamp currentDateAndTime() throws ParseException {
		String s = getCurrentTimeInIST();
		Timestamp date2 = Timestamp.valueOf(s);
		return date2;
	}

	/*
	 * This Function is using for API Response Current Date & Time.
	 */
	public static LocalDateTime getCurrentDateTime() {
		return LocalDateTime.now();
	}

	public static String getCurrentTimeInIST() throws ParseException {
		DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		utcFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		Date timestamp = new Date();
		String istTime = utcFormat.format(timestamp);
		return istTime;
	}

	public static long compareTwoTimeStamps(Timestamp currentTime, Timestamp oldTime) {
		long milliseconds1 = oldTime.getTime();
		long milliseconds2 = currentTime.getTime();
		long diff = milliseconds2 - milliseconds1;
		long diffSeconds = diff / 1000;
		// long diffMinutes = diff / (60 * 1000);
		return diffSeconds;
	}

	public static String dateFormatReports(String date) throws ParseException {
		SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		date = myFormat.format(fromUser.parse(date));
		return date;
	}

	public static String dateFormatForPartner(String date) throws ParseException {
		SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		date = myFormat.format(fromUser.parse(date));
		return date;
	}

	public static boolean isValidDateFormat(String value) {
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			date = sdf.parse(value);
			if (!value.equals(sdf.format(date))) {
				date = null;
			}
		} catch (ParseException ex) {
			return false;
		}
		return date != null;
	}

	public static boolean isValidDateFormat(String from, String to) throws ParseException {
		boolean check = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fromDate = sdf.parse(from);
		Date toDate = sdf.parse(to);
		int result = fromDate.compareTo(toDate);
		if (result > 0) {
			check = true;
		}
		return check;
	}

	public static String convertDateToString(Date date) {
		if (date != null) {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String strDate = dateFormat.format(date);
			return strDate;
		} else {
			return "";
		}

	}

	public static String longToDate(Long date) {
		if (date != null) {
			DateFormat simple = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Date result = new Date(date);
			String strDate = simple.format(date);
			return strDate;
		} else {
			return "";
		}

	}

	public static String convertDateToStringSlash(Date date) {
		if (date != null) {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String strDate = dateFormat.format(date);
			return strDate;
		} else {
			return "";
		}

	}

	public static String convertDateToStringYYYYMMDD(Date date) {
		if (date != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = formatter.format(new Date());
			return strDate;
		} else {
			return "";
		}

	}

	public static String convertDateToStringWithTime(Date date) {
		if (date != null) {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
			String strDate = dateFormat.format(date);
			return strDate;
		} else {
			return "";
		}

	}

	public static String convertDateToStringWithTimeNew(Date date) {
		if (date != null) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
			String strDate = dateFormat.format(date);
			return strDate;
		} else {
			return "";
		}

	}

	public static String convertDateToStringWithTimes(Date date) {
		if (date != null) {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
			String strDate = dateFormat.format(date);
			return strDate;
		} else {
			return "";
		}

	}

	public static String convertDateToStringExpiry(Integer duration) {
		if (duration != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DAY_OF_MONTH, duration - 1);
			String newDate = sdf.format(c.getTime());
			return newDate;
		} else {
			return "";
		}

	}

	public static String convertTimeStampToDate(long timeStamp) {
		if (timeStamp != 0L) {
			Date currentDate = new Date(timeStamp);
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			String newDate = df.format(currentDate);
			return newDate;
		} else {
			return "";
		}

	}

	public static long getMintue(Date expriyDate) throws ParseException {
		Date date = new Date();

		long timeDiff;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String strDate = dateFormat.format(date);
		String expirydate = dateFormat.format(expriyDate);
		System.out.println("strDate=" + strDate);
		System.out.println("expriyDate=" + expirydate);
		Date startDateObj = dateFormat.parse(strDate);
		Date endDateObj = dateFormat.parse(expirydate);
		System.out.println("1:" + strDate.compareTo(expirydate));
		if (strDate.compareTo(expirydate) > 0) {
			timeDiff = startDateObj.getTime() - endDateObj.getTime();
		} else if (strDate.compareTo(expirydate) < 0) {
			timeDiff = startDateObj.getTime() - endDateObj.getTime();
		} else {
			timeDiff = endDateObj.getTime() - startDateObj.getTime();
		}

		long minDiff = timeDiff / (1000 * 60);
		return minDiff;

	}

	public static Date convertStringToDateTime(String date) {
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
				Date dateTime = dateFormat.parse(date);
				return dateTime;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static String convertStringToDateTime2(String date) {
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date dateTime = dateFormat.parse(date);
				return dateTime.toString();
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Date convertStringToDateTimeZone(String date) {
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date dateTime = dateFormat.parse(date);
				return dateTime;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Date StringToDate(String date) {
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date dateTime = dateFormat.parse(date);
				return dateTime;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Date convertStringToDate(String date) {
		try {
			if (date != null) {
				;
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				Date praseDate = simpleDateFormat.parse(date);
				return praseDate;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Long convertStrigDateToLong(String date) {
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		long milliseconds = 0;
		try {
			Date d = f.parse(date);
			milliseconds = d.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return milliseconds;
	}

	public static int dayBetweenTwoDate() {
		Calendar calendar = Calendar.getInstance();
		Date d1 = calendar.getTime();
		calendar.add(Calendar.MONTH, 1);
		Date d2 = calendar.getTime();
		long difference = d2.getTime() - d1.getTime();
		float daysBetween = (difference / (1000 * 60 * 60 * 24));
		int days = (int) daysBetween;
		return days;
	}

	public static String getDay(Date date) {
		if (date != null) {
			SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week abbreviated
			String days = simpleDateformat.format(date);
			return days;
		} else {
			return "";
		}

	}

	public static Date convertStringToDateDDMMYY(String date) {
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
				Date dateTime = dateFormat.parse(date);
				return dateTime;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date convertStringToDateMMDDYYYY(String date) {
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
				Date dateTime = dateFormat.parse(date);
				return dateTime;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static String convertDateTimeFormat(String dateTimeString) {
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeString,
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss.S"));
		return dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	}

	public static String convertDateToSettlement(String inDate) throws Exception {
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
		Date date = inputFormat.parse(inDate);
		return outputFormat.format(date);

	}

	/*
	 * these function used to check the date is match the specific format or not.
	 * like yyyy-MM-dd hh:mm:ss, dd-MM-yyyy HH:mm:ss, yyyy-MM-dd HH.mm.ss.S,
	 * yyyy-MM-dd HH.mm etc
	 */
	public static boolean isValidFormat(String format, String value) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setLenient(false);
		try {
			sdf.parse(value);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	/**
	 * this function is used to convert date yyyy-MM-dd
	 * HH:mm:ss[.SSS][.S]/yyyy-MM-dd HH.mm.ss.S to dd-MM-yyyy HH:mm:ss
	 * 
	 * @param dateTimeString
	 * @return string
	 */
	public static String convertDateTimeFormatNew(String dateTimeString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss[.SSS][.S]");
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
		return dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	}

}
