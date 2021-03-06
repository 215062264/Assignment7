package repository.impl;

import ac.za.cput.Domain.Science;
import ac.za.cput.repository.ScienceRepository;
import ac.za.cput.repository.impl.ScienceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class ScienceRepositoryImplTest {

    private ScienceRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ScienceRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Science> sciences = this.repository.getAll();
        Assert.assertEquals(1, sciences.size());
    }

}
