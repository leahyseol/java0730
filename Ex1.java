package com.exam;

	// TODO Auto-generated method stub
	// class tv
	// method void channelUp() -> channel 1 up
	// method void channelDown()-> channel 1 down

	class TV {
		int channel;

		void channelUp() {
			channel++;
		}

		void channelDown() {
			channel--;
		}
	}

	// class captionTV(subtitle function TV)inheritance TV
	// field boolean caption subtitle condition
	// method void displayCaption()-> subtitle condition :T/F
	class CaptionTV extends TV {
		boolean caption;

		void displayCaption() {
			System.out.println("자막상태: " + caption);
		}
	}

	public class Ex1 {
		public static void main(String[] args) {
			CaptionTV captionTV= new CaptionTV();
			//method call : channelUp()
			captionTV.channelUp();
			//channel field value 
			System.out.println(captionTV.channel);
			captionTV.displayCaption();
		// caption TV variable

		// method call : displayCaption ()

	}// main method

}
