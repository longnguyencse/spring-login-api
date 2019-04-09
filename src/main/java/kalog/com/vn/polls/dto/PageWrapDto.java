package kalog.com.vn.polls.dto;

import org.springframework.data.domain.Page;

import java.util.List;

public class PageWrapDto {

    private List<Object> data;
    private int page;
    private int size;
    private int total;
    private int totalPage;
    private int totalSize;

    public static PageWrapDto pagable(Page page) {
        PageWrapDto pageWrapDto = new PageWrapDto();
        pageWrapDto.setData(page.getContent());
        pageWrapDto.setPage(page.getNumber());
        pageWrapDto.setSize(page.getSize());
        pageWrapDto.setTotalSize(page.getNumberOfElements());
        pageWrapDto.setTotalPage(page.getTotalPages());
        pageWrapDto.setTotal(page.getSize());
        return pageWrapDto;
    }
    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }
}
