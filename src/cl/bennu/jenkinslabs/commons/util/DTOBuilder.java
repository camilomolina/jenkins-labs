package cl.bennu.jenkinslabs.commons.util;

import cl.bennu.jenkinslabs.commons.dto.ItemPaymentDTO;
import cl.bennu.jenkinslabs.commons.dto.PaymentDTO;
import org.apache.commons.collections.IteratorUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DTOBuilder {

    private static List paymentList = new ArrayList();

    static {
        double amount = 0D;
        double amountTotal = 0D;

        // 1
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setId(new Long(1));
        paymentDTO.setName("PCFactory");
        paymentDTO.setDescription("Computer Supplies");
        paymentDTO.setActive(Boolean.TRUE);
        paymentDTO.setDate(new Date());
        paymentDTO.setAddress("Los Leones 100");

        List itemPaymentList = new ArrayList();

        ItemPaymentDTO itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("Mouse");
        itemPaymentDTO.setDescription("Mouse USB v.2.1");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 7000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("Keyboard");
        itemPaymentDTO.setDescription("MS KB 4");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 12000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("MSI");
        itemPaymentDTO.setDescription("MSI KB-8128");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 57000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("Intel");
        itemPaymentDTO.setDescription("Intel i3 3.1");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 35000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("Memory");
        itemPaymentDTO.setDescription("Kingston 4GB");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 18000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        paymentDTO.setItemPaymentList(itemPaymentList);
        paymentDTO.setAmount(new Double(amountTotal));

        paymentList.add(paymentDTO);

        // 2
        paymentDTO = new PaymentDTO();
        paymentDTO.setId(new Long(2));
        paymentDTO.setName("PCFactory");
        paymentDTO.setDescription("Computer Supplies");
        paymentDTO.setActive(Boolean.TRUE);
        paymentDTO.setDate(new Date());
        paymentDTO.setAddress("Los Leones 100");

        amount = 0D;
        amountTotal = 0D;
        itemPaymentList = new ArrayList();

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("NoteBook");
        itemPaymentDTO.setDescription("Notebook HP");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 327000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        paymentDTO.setItemPaymentList(itemPaymentList);
        paymentDTO.setAmount(new Double(amountTotal));

        paymentList.add(paymentDTO);


        // 3
        paymentDTO = new PaymentDTO();
        paymentDTO.setId(new Long(3));
        paymentDTO.setName("Wei");
        paymentDTO.setDescription("Computer Supplies");
        paymentDTO.setActive(Boolean.TRUE);
        paymentDTO.setDate(new Date());
        paymentDTO.setAddress("Providencia 2344");

        amount = 0D;
        amountTotal = 0D;
        itemPaymentList = new ArrayList();

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("NoteBook");
        itemPaymentDTO.setDescription("Notebook Asus");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 381000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        paymentDTO.setItemPaymentList(itemPaymentList);
        paymentDTO.setAmount(new Double(amountTotal));

        paymentList.add(paymentDTO);


        // 4
        paymentDTO = new PaymentDTO();
        paymentDTO.setId(new Long(4));
        paymentDTO.setName("Refly Chile");
        paymentDTO.setDescription("Computer Supplies");
        paymentDTO.setActive(Boolean.TRUE);
        paymentDTO.setDate(new Date());
        paymentDTO.setAddress("San Diego 120");

        amount = 0D;
        amountTotal = 0D;
        itemPaymentList = new ArrayList();

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("DVD");
        itemPaymentDTO.setDescription("DVD Burner");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 14000;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        itemPaymentDTO = new ItemPaymentDTO();
        itemPaymentDTO.setName("DVD");
        itemPaymentDTO.setDescription("DVD Disk");
        itemPaymentDTO.setPaymentId(paymentDTO.getId());
        itemPaymentDTO.setActive(Boolean.TRUE);
        amount = 250;
        amountTotal += amount;
        itemPaymentDTO.setAmount(new Double(amount));
        itemPaymentList.add(itemPaymentDTO);

        paymentDTO.setItemPaymentList(itemPaymentList);
        paymentDTO.setAmount(new Double(amountTotal));

        paymentList.add(paymentDTO);

    }

    public static List getAll() {
        return paymentList;
    }

    public static PaymentDTO get(Long id) {
        Iterator iterator = IteratorUtils.getIterator(paymentList);
        while(iterator.hasNext()) {
            PaymentDTO paymentDTO = (PaymentDTO) iterator.next();
            if (paymentDTO.getId().equals(id)) {
                return paymentDTO;
            }
        }

        return null;
    }

    public static void add(PaymentDTO paymentDTO) {
        paymentList.add(paymentDTO);
    }

    public static void delete(Long id) {
        Iterator iterator = IteratorUtils.getIterator(paymentList);
        while(iterator.hasNext()) {
            PaymentDTO paymentDTO = (PaymentDTO) iterator.next();
            if (paymentDTO.getId().equals(id)) {
                paymentList.remove(paymentDTO);
                break;
            }
        }
    }
}
