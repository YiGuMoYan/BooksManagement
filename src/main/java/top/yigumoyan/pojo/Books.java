package top.yigumoyan.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
