package uz.laza.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.laza.comment.entiry.Comment;
import uz.laza.enums.UserType;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "`user`")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private Integer emailCode;
    private UserType userType;
    private LocalDate updatedDate;
    private LocalDate createdDate;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
