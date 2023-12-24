![image](https://github.com/arnavvaryani/INFO5100-global-immunization-portal/assets/37153449/d926e833-9752-4c8c-bdea-5724b82fda4a)

<img width="529" alt="image" src="https://github.com/arnavvaryani/INFO5100-global-immunization-portal/assets/37153449/23d2f751-2554-48a0-a0f2-f13440bfabbf">

Application Flow

1. Login as Superuser and create a region, enterprises, and their admin users.
2. Login as the all admins and create all organizations and their users one-by-one.
3. Login as Manufacturer and create a vaccine, send it to approval.
4. Login as Economy and approve the vaccine by filling remaining fields.
5. Login as Purchases and request vaccines by selecting a manufacturer, specifying the quantity and
then place the order.
6. Login as Purchases again and logout, this is to prevent a glitch in the application.
7. Login as Sales and approve the order.
8. Login as Person and schedule a vaccination by selecting the distributor.
9. Login and Distributor and approve the vaccination schedule by giving an appointment date.
10. Login as Person and schedule a doctor appointment by selecting a hospital.
11. Login as Doctor and approve the appointment by giving an appointment date.
12. While logged in as Doctor, send results to lab test
13. Login as Lab and generate a report by first filling in the radio buttons and click generate report
button. Now type in the generated result exactly as is in the field to left of generated result text.
Enter a comment and click send to doctor.
14. Login as Doctor and click prescribe medicine.
15. Login as Pharma (sub entity of Hospital) and click available.
16. Login as Person to see that that all the tables are populated.
17. Login as Health and click generate pie chart. It should only have 1 slice (Approved). If you wish to
show another slice then repeat step 8 and then step 17.

Login Credentials
1. Superuser: superuser, superuser
2. Pharmaceuticals Admin: pfizerusa Password!123
3. Government Admin: usgov Password!123
4. Hospital Admin: massgenadmin Password!123
5. Service Admin: usmeds Password!123
6. Manufacturer: pfizermanu Password!123
7. Sales: pfizersales Password!123
8. Economy: usecon Password!123
9. Health: ushealth Password!123
10. Person: johnadam Password!123
11. Doctor: massgendoc Password!123
12. Pharma(Hospital sub-entity): massgenpharma Password!123
13. Lab: massgenlab Password!123
14. Purchases: usmedspurchases Password!123
15. Distrbutor: usmedsdist Purchases: usmedspurchases Password!123
