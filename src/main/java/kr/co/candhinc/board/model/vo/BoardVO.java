package kr.co.candhinc.board.model.vo;

public class BoardVO {
	private int idx;
	private String title;
	private String content;
	private String imgPath;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	
	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", title=" + title + ", content=" + content + ", imgPath=" + imgPath + "]";
	}
	
	
	
}
