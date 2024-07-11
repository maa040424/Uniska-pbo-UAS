package UAS_1;

public class Review {
    private String reviewer;
    private String komentar;
    private int rating;

    public Review(String reviewer, String komentar, int rating) {
        this.reviewer = reviewer;
        this.komentar = komentar;
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            this.rating = 3;
            System.out.println("Rating tidak valid, menggunakan default rating 3.");
        }
        System.out.println("Review berhasil dibuat oleh " + reviewer);
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating tidak valid, tidak ada perubahan pada rating.");
        }
    }

    public void tampilkanReview() {
        System.out.println("Reviewer: " + reviewer);
        System.out.println("Komentar: " + komentar);
        System.out.println("Rating: " + rating);
    }
}
