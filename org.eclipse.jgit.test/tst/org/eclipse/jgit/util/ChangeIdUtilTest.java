import java.io.IOException;
	public void testId() throws IOException {
	public void notestCommitDashV() throws Exception {
		assertEquals("a\n" + //
				"\n" + //
				"Change-Id: I7fc3876fee63c766a2063df97fbe04a2dddd8d7c\n" + //
				SOB1 + //
				SOB2, //
				call("a\n" + //
						"\n" + //
						SOB1 + //
						SOB2 + //
						"\n" + //
						"# on branch master\n" + //
						"diff --git a/src b/src\n" + //
						"new file mode 100644\n" + //
						"index 0000000..c78b7f0\n"));
	}

	private void hookDoesNotModify(final String in) throws Exception {
	private String call(final String body) throws Exception {
	private String call(final String body, boolean replaceExisting) throws Exception {