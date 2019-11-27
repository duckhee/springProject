package kr.co.candhinc.board.model.vo;

public class ReplyVO {
	private int idx, bno;
	private String reWriter, reContent;

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getReWriter() {
		return reWriter;
	}
	public void setReWriter(String reWriter) {
		this.reWriter = reWriter;
	}
	public String getReContent() {
		return reContent;
	}
	public void setReContent(String reContent) {
		this.reContent = reContent;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [idx=" + idx + ", bno=" + bno + ", reWriter=" + reWriter + ", reContent=" + reContent + "]";
	}
	
	
}
