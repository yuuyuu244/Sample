package listSample;

/**
 * sample bean class.
 *
 * @author yuki
 *
 */
public class OwnBean {
	private String word;

	/**
	 * default constractor.
	 * @param word
	 */
	public OwnBean(String word) {
		this.word = word;
	}

	/**
	 * getter.
	 * @return
	 */
	public String getWord() {
		return word;
	}

	/**
	 * setter.
	 * @param word
	 */
	public void setWord(String word) {
		this.word = word;
	}

}
