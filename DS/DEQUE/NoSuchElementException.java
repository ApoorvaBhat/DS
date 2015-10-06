 class NoSuchElementException extends Exception{

	NoSuchElementException() {
		System.out.println("UnderFlow Exception");
	}

	 NoSuchElementException(String s) {
		System.out.println("Queue is empty");
	}

}
