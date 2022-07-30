package codezip.code_zip.service;

import codezip.code_zip.dto.Mapper;
import codezip.code_zip.dto.requestDto.AuthorRequestDto;
import codezip.code_zip.dto.responseDto.AuthorResponseDto;
import codezip.code_zip.model.Author;
import codezip.code_zip.model.Zipcode;
import codezip.code_zip.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final ZipcodeService zipcodeService;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository, ZipcodeService zipcodeService) {
        this.authorRepository = authorRepository;
        this.zipcodeService = zipcodeService;
    }

    @Transactional
    @Override
    public AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto) {
        Author author = new Author();
        author.setName(authorRequestDto.getName());
        if (authorRequestDto.getZipcodeId() == null) {
            throw new IllegalArgumentException("author need a zipcode");
        }
        Zipcode zipcode = zipcodeService.getZipcode(authorRequestDto.getZipcodeId());
        author.setZipcode(zipcode);
        authorRepository.save(author);
        Mapper mapper = null;
        return mapper.authorToAuthorResponseDto(author);
    }

    @Override
    public List<AuthorResponseDto> getAuthors() {
        List<Author> authors = StreamSupport
                .stream(authorRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        Mapper mapper = null;
        return mapper.authorsToAuthorResponseDtos(authors);
    }

    @Override
    public AuthorResponseDto getAuthorById(Long authorId) {
        Mapper mapper = null;
        return mapper.authorToAuthorResponseDto(getAuthor(authorId));
    }

    @Override
    public Author getAuthor(Long authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow(() ->
                new IllegalArgumentException(
                        "author with id: " + authorId + " could not be found"));
        return author;
    }

    @Override
    public AuthorResponseDto deleteAuthor(Long authorId) {
        Author author = getAuthor(authorId);
        authorRepository.delete(author);
        Mapper mapper = null;
        return mapper.authorToAuthorResponseDto(author);
    }

    @Transactional
    @Override
    public AuthorResponseDto editAuthor(Long authorId, AuthorRequestDto authorRequestDto) {
        Author authorToEdit = getAuthor(authorId);
        authorToEdit.setName(authorRequestDto.getName());
        if (authorRequestDto.getZipcodeId() != null) {
            Zipcode zipcode = zipcodeService.getZipcode(authorRequestDto.getZipcodeId());
            authorToEdit.setZipcode(zipcode);
        }
        Mapper mapper = null;
        return mapper.authorToAuthorResponseDto(authorToEdit);
    }

    @Transactional
    @Override
    public AuthorResponseDto addZipcodeToAuthor(Long authorId, Long zipcodeId) {
        Author author = getAuthor(authorId);
        Zipcode zipcode = zipcodeService.getZipcode(zipcodeId);
        if (Objects.nonNull(author.getZipcode())) {
            throw new RuntimeException("author already has a zipcode");
        }
        author.setZipcode(zipcode);
        Mapper mapper = null;
        return mapper.authorToAuthorResponseDto(author);
    }

    @Transactional
    @Override
    public AuthorResponseDto deleteZipcodeFromAuthor(Long authorId) {
        Author author = getAuthor(authorId);
        author.setZipcode(null);
        Mapper mapper = null;
        return mapper.authorToAuthorResponseDto(author);
    }
}
