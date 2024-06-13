package com.example.EntregaParcial;

import com.example.EntregaParcial.entities.articles.ArticleManufactured;
import com.example.EntregaParcial.entities.articles.ArticleManufacturedDetail;
import com.example.EntregaParcial.entities.articles.InputArticle;
import com.example.EntregaParcial.entities.articles.MeasuringUnit;
import com.example.EntregaParcial.entities.enums.*;
import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.entities.persons.Employee;
import com.example.EntregaParcial.entities.persons.Image;
import com.example.EntregaParcial.entities.persons.User;
import com.example.EntregaParcial.entities.places.*;
import com.example.EntregaParcial.entities.promotions.DetailPromotion;
import com.example.EntregaParcial.entities.promotions.Promotion;
import com.example.EntregaParcial.entities.purchases.Category;
import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.example.EntregaParcial.entities.purchases.Invoice;
import com.example.EntregaParcial.entities.purchases.Request;
import com.example.EntregaParcial.repositories.articles.ArticleManufacturedDetailRepository;
import com.example.EntregaParcial.repositories.articles.ArticleManufacturedRepository;
import com.example.EntregaParcial.repositories.articles.InputArticleRepository;
import com.example.EntregaParcial.repositories.articles.MeasuringUnitRepository;
import com.example.EntregaParcial.repositories.persons.ClientRepository;
import com.example.EntregaParcial.repositories.persons.EmployeeRepository;
import com.example.EntregaParcial.repositories.persons.ImageRepository;
import com.example.EntregaParcial.repositories.persons.UserRepository;
import com.example.EntregaParcial.repositories.places.*;
import com.example.EntregaParcial.repositories.promotions.DetailPromotionRepository;
import com.example.EntregaParcial.repositories.promotions.PromotionRepository;
import com.example.EntregaParcial.repositories.purchases.CategoryRepository;
import com.example.EntregaParcial.repositories.purchases.DetailRequestRepository;
import com.example.EntregaParcial.repositories.purchases.InvoiceRepository;
import com.example.EntregaParcial.repositories.purchases.RequestRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class EntregaParcialApplication {
	@Autowired
	CountryRepository countryRepository;
	@Autowired
	ProvinceRepository provinceRepository;
	@Autowired
	LocalityRepository localityRepository;
	@Autowired
	AdressRepository adressRepository;
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	BranchRepository branchRepository;
	@Autowired
	ImageRepository imageRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	RequestRepository requestRepository;
	@Autowired
	DetailRequestRepository detailRequestRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	PromotionRepository promotionRepository;
	@Autowired
	DetailPromotionRepository detailPromotionRepository;
	@Autowired
	MeasuringUnitRepository measuringUnitRepository;
	@Autowired
	InputArticleRepository inputArticleRepository;
	@Autowired
	ArticleManufacturedRepository articleManufacturedRepository;
	@Autowired
	ArticleManufacturedDetailRepository articleManufacturedDetailRepository;
	@Autowired
	InvoiceRepository invoiceRepository;

	public static void main(String[] args) {
		SpringApplication.run(EntregaParcialApplication.class, args);
		System.out.println("Servidor iniciado.");
	}

	@Bean
	@Transactional
	CommandLineRunner init(
			//PLACES
			CountryRepository countryRepository,
			ProvinceRepository provinceRepository,
			LocalityRepository localityRepository,
			AdressRepository adressRepository,
			CompanyRepository companyRepository,
			BranchRepository branchRepository,

			//PERSONS
			ImageRepository imageRepository,
			UserRepository userRepository,
			EmployeeRepository employeeRepository,
			ClientRepository clientRepository,

			//PURCHASES
			RequestRepository requestRepository,
			DetailRequestRepository detailRequestRepository,
			CategoryRepository categoryRepository,
			InvoiceRepository invoiceRepository,

			//PROMOTIONS
			PromotionRepository promotionRepository,
			DetailPromotionRepository detailPromotionRepository,

			//ARTICLES
			MeasuringUnitRepository measuringUnitRepository,
			InputArticleRepository inputArticleRepository,
			ArticleManufacturedRepository articleManufacturedRepository,
			ArticleManufacturedDetailRepository articleManufacturedDetailRepository
	){
		return args -> {
			/*
			//PLACES
			Country country1 = Country.builder()
					.name("España")
					.build();
			countryRepository.save(country1);

			Province province1  = Province.builder()
					.name("Madrid")
					.country(country1)
					.build();
			provinceRepository.save(province1);

			Province province2  = Province.builder()
					.name("Barcelona")
					.country(country1)
					.build();
			provinceRepository.save(province2);

			Locality locality1 = Locality.builder()
					.name("Getafe")
					.province(province1)
					.build();
			localityRepository.save(locality1);

			Locality locality2 = Locality.builder()
					.name("Leganes")
					.province(province1)
					.build();
			localityRepository.save(locality2);

			Adress adress1 = Adress.builder()
					.street("De la ruda")
					.number(5012)
					.cp(1002)
					.locality(locality1)
					.build();
			adressRepository.save(adress1);

			Adress adress2 = Adress.builder()
					.street("De la ostia")
					.number(5012)
					.cp(1002)
					.locality(locality1)
					.build();
			adressRepository.save(adress2);

			Adress adress3 = Adress.builder()
					.street("Rodas")
					.number(1200)
					.cp(1010)
					.locality(locality1)
					.build();
			adressRepository.save(adress3);

			Company company1 = Company.builder()
					.reasonSocial("Decathlon SA")
					.name("Decathlon")
					.cuil(10048813)
					.build();
			companyRepository.save(company1);

			Branch branch1 = Branch.builder()
					.name("Decathlon de Madrid")
					.headOffice(Boolean.TRUE)
					.adress(adress3)
					.openingHours(LocalTime.of(8,30))
					.hoursClosing(LocalTime.of(20,30))
					.company(company1)
					.build();
			branchRepository.save(branch1);

			//PERSONS
			Image image1 = Image.builder()
					.denomination("ClientePablo.png")
					.build();
			imageRepository.save(image1);

			Image image2 = Image.builder()
					.denomination("EmpleadoCappelo.png")
					.build();
			imageRepository.save(image2);

			User user1 = User.builder()
					.auth0Id("pass")
					.userName("pabloLima")
					.build();
			userRepository.save(user1);

			User user2 = User.builder()
					.auth0Id("pass2")
					.userName("cappeloFederico")
					.build();
			userRepository.save(user2);

			Employee employee1 = Employee.builder()
					.branch(branch1)
					.build();
			employee1.setFirstName("Federico");
			employee1.setLastName("Cappelo");
			employee1.setRole(Role.COCINERO);
			employee1.setPhone("5839941");
			employee1.setEmail("cappelo@gmail.com");
			employee1.setDateBirth("1997-02-01");
			employee1.setImagePerson(image2);
			employee1.setUser(user2);
			employeeRepository.save(employee1);

			Client client1 = Client.builder().build();
			client1.setFirstName("Pablo");
			client1.setLastName("Lima");
			client1.setPhone("2616524414");
			client1.setEmail("lima@gmail.com");
			client1.setDateBirth("2001-11-22");
			client1.setImagePerson(image1);
			client1.setUser(user1);
			client1.setRole(Role.CLIENTE);
			client1.getAdresses().add(adress1);
			client1.getAdresses().add(adress2);
			clientRepository.save(client1);

			//PURCHASES
			Request request1 = Request.builder()
					.dateOrder(LocalDate.of(2023,05,23))
					.branch(branch1).client(client1)
					.client(client1)
					.employee(employee1).total(250.0)
					.state(State.PENDIENTE)
					.paymentForm(PaymentForm.EFECTIVO)
					.estimatedEndTime(LocalTime.of(12,55))
					.shipmentType(ShipmentType.DELIVERY)
					.totalCost(0.0)
					.build();
			requestRepository.save(request1);

			DetailRequest detailRequest1 = DetailRequest.builder()
					.request(request1)
					.quantity(5)
					.subtotal(450.0)
					.build();
			detailRequestRepository.save(detailRequest1);

			DetailRequest detailRequest2 = DetailRequest.builder()
					.request(request1)
					.quantity(10)
					.subtotal(500.0)
					.build();
			detailRequestRepository.save(detailRequest2);

			Category category1 = Category.builder()
					.denomitacion("Cocina")
					.build();
			categoryRepository.save(category1);

			Category subCategory1 = Category.builder()
					.denomitacion("Horno")
					.categoryDad(category1)
					.build();
			categoryRepository.save(subCategory1);

			Category subCategory2 = Category.builder()
					.denomitacion("Heladeras")
					.categoryDad(category1)
					.build();
			categoryRepository.save(subCategory2);

			category1.getSubcategories().add(subCategory1);
			category1.getSubcategories().add(subCategory2);
			categoryRepository.save(category1);

			branch1.getCategories().add(category1);

			Image image3 = Image.builder()
					.denomination("Promo 2x1.png")
					.build();
			imageRepository.save(image3);

			Image image4 = Image.builder()
					.denomination("Promo 3x2.png")
					.build();
			imageRepository.save(image4);

			Promotion promotion1 = Promotion.builder()
					.denomination("Promo 2x1")
					.descriptionDiscount("Levas 2 pagas 1")
					.dateFrom(LocalDate.of(2024,06,12))
					.dateTo(LocalDate.of(2024, 06, 25))
					.timeFrom(LocalTime.of(20,30))
					.timeTo(LocalTime.of(23,30))
					.promotionalPrice(2500.0)
					.promotionType(PromotionType.PROMOCION1)
					.build();
			promotion1.getImagesPromotion().add(image3);
			//promotion1.getBranches().add(branch1);
			promotionRepository.save(promotion1);

			Promotion promotion2 = Promotion.builder()
					.denomination("Promo 3x2")
					.descriptionDiscount("Levas 3 pagas 2")
					.dateFrom(LocalDate.of(2024,06,12))
					.dateTo(LocalDate.of(2024, 06, 25))
					.timeFrom(LocalTime.of(20,30))
					.timeTo(LocalTime.of(23,30))
					.promotionalPrice(3000.0)
					.promotionType(PromotionType.PROMOCION1)
					.build();
			promotion2.getImagesPromotion().add(image4);
			//promotion2.getBranches().add(branch1);
			promotionRepository.save(promotion2);

			branch1.getPromotions().add(promotion1);
			branch1.getPromotions().add(promotion2);
			branchRepository.save(branch1);

			MeasuringUnit measuringUnit1 = MeasuringUnit.builder()
					.denomination("Kilos")
					.build();
			measuringUnitRepository.save(measuringUnit1);

			Image image5 = Image.builder()
					.denomination("CocaCola.png")
					.build();
			imageRepository.save(image5);

			Image image6 = Image.builder()
					.denomination("Botella de plastico.png")
					.build();
			imageRepository.save(image6);

			InputArticle inputArticle1 = InputArticle.builder()
					.denomination("Coca Colas")
					.priceSale(230.0)
					.purchasePrice(460.6)
					.actualStock(36)
					.maxStock(150)
					.isToElaborate(Boolean.FALSE)
					.category(category1)
					.measuringUnit(measuringUnit1)
					.build();
			inputArticle1.getImagesArticle().add(image5);
			inputArticleRepository.save(inputArticle1);

			ArticleManufactured articleManufactured1 = ArticleManufactured.builder()
					.description("Botellas de plastico reciclado")
					.category(subCategory1)
					.priceSale(140.0)
					.denomination("Botellas de plastico")
					.timeEstimatedMinutes(60)
					.preparation("De forma industrial")
					.measuringUnit(measuringUnit1)
					.build();
			articleManufactured1.getImagesArticle().add(image6);
			articleManufacturedRepository.save(articleManufactured1);

			ArticleManufacturedDetail articleManufacturedDetail1 = ArticleManufacturedDetail.builder()
					.quantity(2)
					.inputArticle(inputArticle1)
					.articleManufactured(articleManufactured1)
					.build();
			articleManufacturedDetailRepository.save(articleManufacturedDetail1);

			DetailPromotion detailPromotion1 = DetailPromotion.builder()
					.quantity(10)
					.article(articleManufactured1)
					.promotion(promotion1)
					.build();
			detailPromotionRepository.save(detailPromotion1);

			Invoice invoice1 = Invoice.builder()
					.request(request1)
					.paymentForm(PaymentForm.EFECTIVO)
					.dateInvoicing(LocalDate.of(2024,06,10))
					.totalSales(request1.getTotal())
					.build();
			invoiceRepository.save(invoice1);

			detailRequest1.setArticle(articleManufactured1);
			detailRequestRepository.save(detailRequest1);

			detailRequest2.setArticle(inputArticle1);
			detailRequestRepository.save(detailRequest2);
			 */
		};
	}

}
