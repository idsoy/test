package org.idsoy.test.emoji;

import com.vdurmont.emoji.EmojiParser;

public class EmojiUtils {
	
	public static String enCodeEmoji() {
		String str = "An 😀awesome 😃string with a few 😉emojis!";
		String result = EmojiParser.parseToAliases(str);
		System.out.println(result);
		return result;
	}
	
	public static String deCodeEmoji() {
		
		String str = "An :grinning:awesome :smiley:string &#128516;with a few :wink:emojis!";
		String result = EmojiParser.parseToUnicode(str);
		System.out.println(result);
		return result;
		
	}
	
	public static void main(String[] args) {
		deCodeEmoji();
	}

}
