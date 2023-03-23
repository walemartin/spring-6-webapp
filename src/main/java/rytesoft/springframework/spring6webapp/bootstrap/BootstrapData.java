package rytesoft.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rytesoft.springframework.spring6webapp.domain.Author;
import rytesoft.springframework.spring6webapp.domain.Book;
import rytesoft.springframework.spring6webapp.domain.Publisher;
import rytesoft.springframework.spring6webapp.repositories.AuthoRepository;
import rytesoft.springframework.spring6webapp.repositories.BookRepository;
import rytesoft.springframework.spring6webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthoRepository authoRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthoRepository authoRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authoRepository = authoRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository= publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd=new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("62609768");

        Author ericSaved=authoRepository.save(eric);
        Book dddSaved=bookRepository.save(ddd);


        Author ericd = new Author();
        ericd.setFirstName("Wale");
        ericd.setLastName("Martin");

        Book dddc=new Book();
        dddc.setTitle("Solid Pattern Design");
        dddc.setIsbn("629768");

        Author ericSave=authoRepository.save(ericd);
        Book dddSave=bookRepository.save(dddc);

        ericSaved.getBooks().add(dddSaved);
        ericSave.getBooks().add(dddSave);

        Publisher pub=new Publisher();
        pub.setPublisherName("John Doe");
        pub.setCity("Ikeja");
        pub.setZip("23401");
        pub.setState("Lagos");
        pub.setAddress("18, Diya Street");

        Publisher pub1=new Publisher();
        pub1.setPublisherName("John Doe");
        pub1.setCity("Ikeja");
        pub1.setZip("23401");
        pub1.setState("Lagos");
        pub1.setAddress("18, Diya Street");

        Publisher pb= publisherRepository.save(pub);
        Publisher pb2=publisherRepository.save(pub1);



        authoRepository.save(ericSaved);
        authoRepository.save(ericSave);

        System.out.println("In Bootstrap");
        System.out.println("Author count "+authoRepository.count());
        System.out.println("Book Count "+bookRepository.count());
        System.out.println("Publisher Count "+publisherRepository.count());


    }
}
