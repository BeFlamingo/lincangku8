package homeworkeight;

import java.util.*;

public class Book implements Comparable<Book> {
	int number;
	String title;
	String press;
	double price;

	public static void main(String[] args) {
		Book book1 = new Book(12345, "新华字典", "商务印书馆", 40);
		Book book2 = new Book(54321, "java", "人民出版社", 20);
		Book book3 = new Book(13524, "C语言", "清华大学出版社", 40);
		Book book4 = new Book(13524, "C语言", "清华大学出版社", 40);

		Map<Integer, Book> bookMap = new HashMap<>();
		bookMap.put(12345, book1);
		bookMap.put(54321, book2);
		bookMap.put(13524, book3);
		bookMap.put(13524, book4);

		Set<Integer> keySet = bookMap.keySet();
		for (Integer number : keySet) {
			System.out.println(bookMap.get(number));
		}

	}

	public Book() {
		super();
	}

	public Book(int number, String title, String press, double price) {
		super();
		this.number = number;
		this.title = title;
		this.press = press;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "number: " + number + "\ttitle: " + title + "\tprice: " + price + "\tpress: " + press;
	}

	@Override
	public int compareTo(Book o) {
		if (this.price < o.price) {
			return -1;
		} else if (this.price > o.price) {
			return 1;
		} else {
			if (this.number < o.number) {
				return -1;
			} else if (this.number > o.number) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 3;
		int result = 1;

		if (title != null) {
			result = result * prime + title.hashCode();
		}

		if (press != null) {
			result = result * prime + press.hashCode();
		}

		return (int) (result + number * prime + price * prime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Book other = (Book) obj;
		if (number != other.number) {
			return false;
		}

		if (price != other.price) {
			return false;
		}

		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}

		if (press == null) {
			if (other.press != null) {
				return false;
			}
		} else if (!press.equals(other.press)) {
			return false;
		}

		return true;

	}
}
