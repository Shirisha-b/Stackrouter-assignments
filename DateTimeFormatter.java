public static void main(String[] args) {
		
  DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M dd, yyyy, hh:mm");
  DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
  DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm");
  DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		
  System.out.println(dtf1.format(LocalDateTime.now()));
  System.out.println(dtf2.format(LocalDateTime.now()));
  System.out.println(dtf3.format(LocalDateTime.now()));
  System.out.println(dtf4.format(LocalDateTime.now()));
}